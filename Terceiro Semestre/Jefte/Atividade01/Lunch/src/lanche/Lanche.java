package lanche;

public class Lanche {
    private int codigo;
    private String especificacao;
    private float preco;
    private String imagem;

    public Lanche(int codigo, String especificacao, float preco, String imagem) {
        super();
        this.codigo = codigo;
        this.especificacao = especificacao;
        this.preco = preco;
        this.imagem = imagem;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getEspecificacao() {
        return especificacao;
    }
    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}
