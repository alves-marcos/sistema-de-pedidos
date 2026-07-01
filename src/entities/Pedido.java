package entities;

import entities.enums.StatusPedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Integer id;
    private LocalDateTime data;
    private StatusPedido status;

    private static Integer contador = 1;

    private List<ItemPedido> listaItens;

    public Pedido(StatusPedido status) {

        this.id = contador++;
        this.data = LocalDateTime.now();
        this.status = status;
        this.listaItens = new ArrayList<>();

    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public List<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void adicionarItem(ItemPedido item) {

        listaItens.add(item);

    }

    public void removerItem(int idProduto) {

        listaItens.removeIf(item ->
                item.getProduto().getID() == idProduto);

    }

    public double totalPedido() {

        double soma = 0;

        for (ItemPedido item : listaItens) {

            soma += item.subtotal();

        }

        return soma;

    }

    public String resumoPedido() {

        StringBuilder sb = new StringBuilder();

        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        sb.append("===============================\n");
        sb.append("PEDIDO Nº ").append(id).append("\n");
        sb.append("Data: ").append(data.format(fmt)).append("\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("-------------------------------\n");

        if (listaItens.isEmpty()) {

            sb.append("Nenhum item no pedido.\n");

        } else {

            for (ItemPedido item : listaItens) {

                sb.append(item).append("\n");

            }

        }

        sb.append("-------------------------------\n");
        sb.append(String.format("TOTAL: R$ %.2f", totalPedido()));
        sb.append("\n===============================");

        return sb.toString();

    }

}