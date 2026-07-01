package entities;

public class ItemPedido {

    private Produto produto;
    private Integer quantidade;

    public ItemPedido(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double subtotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {

        return String.format(
                "%s | Qtd: %d | Preço Unit.: R$ %.2f | Subtotal: R$ %.2f",
                produto.getNome(),
                quantidade,
                produto.getPreco(),
                subtotal()
        );

    }

}