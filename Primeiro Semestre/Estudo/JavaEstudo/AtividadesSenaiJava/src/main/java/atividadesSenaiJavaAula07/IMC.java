
package atividadesSenaiJavaAula07;


public class IMC {
    private float height, weight;
    private String status, name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void status(){
        if(this.getWeight()/(this.getHeight()*this.getHeight())<20) status="Abaiaxo do peso, alimente-se mais.";
        else if(this.getWeight()/(this.getHeight()*this.getHeight())>=20 && this.getWeight()/(this.getHeight()*this.getHeight())<25) status="Peso normal, tudo certo por aqui";
        else if(this.getWeight()/(this.getHeight()*this.getHeight())>=25 && this.getWeight()/(this.getHeight()*this.getHeight())<30) status="Sobre peso, maneire um pouco na comida e faça exercicios :)";
        else if(this.getWeight()/(this.getHeight()*this.getHeight())>=30 && this.getWeight()/(this.getHeight()*this.getHeight())<40) status="Obeso, maneire na comida e faça exercicios :)";
        else status="Obeso morbido, procure uma funeraria :)";        
    }
}
