package entities;

public class Produto {

    private static Integer contador = 1;

    private Integer id;
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {

        this.id = contador++;
        this.nome = nome;
        this.preco = preco;

    }

    public Integer getID() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {

        return String.format(
                "ID: %d | Produto: %s | Preço: R$ %.2f",
                id,
                nome,
                preco
        );

    }

}