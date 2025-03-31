let dolar;

let usdInput = document.querySelector("#usd");
let brlInput = document.querySelector("#brl");

async function buscarDolar() {
    const url = "https://economia.awesomeapi.com.br/json/last/USD-BRL";
    
    try {
        const response = await fetch(url);
        const data = await response.json();
        
        dolar = parseFloat(data.USDBRL.high);
        console.log("Dólar atualizado:", dolar);
    } catch (error) {
        console.error("Erro ao buscar a cotação do dólar:", error);
    }
}

// Função para inicializar o conversor após obter a cotação
async function iniciarConversor() {
    await buscarDolar(); // Aguarda a cotação ser carregada
    convert("usd-to-brl"); // Realiza a conversão inicial
}

iniciarConversor(); // Inicia o conversor
usdInput.value = 1;
convert("usd-to-brl");

usdInput.addEventListener("keyup", () => {
    convert("usd-to-brl");
});

brlInput.addEventListener("keyup", () => {
    convert("brl-to-usd");
});

usdInput.addEventListener("blur", () => {
    usdInput.value = formatCurrency(usdInput.value);
});

brlInput.addEventListener("blur", () => {
    brlInput.value = formatCurrency(brlInput.value);
});

function formatCurrency(value) {
    let fixedValue = fixValue(value);
    let options = {
        useGrouping: false,
        minimumFractionDigits: 2
    };
    let formatter = new Intl.NumberFormat("pt-br", options);

    return formatter.format(fixedValue);
}

function fixValue(value) {
    let fixedValue = value.replace(",", ".");
    let floatValue = parseFloat(fixedValue);
    if (isNaN(floatValue)) {
        floatValue = 0;
    }
    return floatValue;
}

async function convert(type) {
    if (!dolar) {
        await buscarDolar(); // Garante que a cotação foi carregada
    }

    if (type == "usd-to-brl") {
        let fixedValue = fixValue(usdInput.value);
        let result = fixedValue * dolar;
        result = result.toFixed(2);
        brlInput.value = formatCurrency(result);
    } else if (type == "brl-to-usd") {
        let fixedValue = fixValue(brlInput.value);
        let result = fixedValue / dolar;
        result = result.toFixed(2);
        usdInput.value = formatCurrency(result);
    }
}