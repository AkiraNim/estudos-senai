let dolar;

let usdInput = document.querySelector("#usd");
let brlInput = document.querySelector("#brl");


async function buscarDolar() {
    const url = "https://economia.awesomeapi.com.br/json/last/USD-BRL";
    const response = await fetch(url);
    const data = await response.json();
    
    dolar = data.USDBRL.high; // Atualiza a variável global
    console.log(dolar);
    return dolar;
}

dolar = buscarDolar();





usdInput.addEventListener("keyup", () => {
    convert("usd-to-brl");
})

brlInput.addEventListener("keyup", () => {
    convert("brl-to-usd");
})

usdInput.addEventListener("blur", () => {
    usdInput.value = formatCurrency(usdInput.value);
})

brlInput.addEventListener("blur", () => {
    brlInput.value = formatCurrency(brlInput.value);
})

usdInput.value = "1000,00";
convert("usd-to-brl");

function formatCurrency(value){
    let fixedValue = fixValue(value);
    let options = {
        useGrouping: false,
        minimumFractionDigits: 2
    }
    let formater = new Intl.NumberFormat("pt-br", options);

    return formater.format(fixedValue);
}

function fixValue(value){
    let fixedValue = value.replace(",", ".");
    let floatValue = parseFloat(fixedValue);
    if(floatValue == NaN){
        floatValue=0;
    }

    return floatValue;
}

function convert(type){
    if(type == "usd-to-brl"){
        let fixedValue = fixValue(usdInput.value);
        let result = fixedValue * dolar;
        result = result.toFixed(2);

        brlInput.value = formatCurrency(result);
    }
    else if(type == "brl-to-usd"){
        let fixedValue = fixValue(brlInput.value);
        result = fixedValue / dolar;
        console.log(result);
        result = result.toFixed(2);

       usdInput.value = formatCurrency(result);
    }
}