package entities;

import entities.enums.StatusPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer id;
    private Date data;
    private StatusPedido status;

    private List<ItemPedido> listaItens;

    public Pedido(Integer id, Date data, StatusPedido status) {
        this.id = id;
        this.data = data;
        this.status = status;
        this.listaItens = new ArrayList<>();
    }
}
