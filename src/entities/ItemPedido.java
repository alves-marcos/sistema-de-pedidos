package entities;

public class ItemPedido {
    private Integer quantidade;
    private Produto produto;

    public ItemPedido(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double subtotal(){
        return quantidade * produto.getPrice();
    }


}
