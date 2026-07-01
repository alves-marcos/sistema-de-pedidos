package entities;

import entities.enums.StatusPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Pedido.contador = contador;
    }

    public List<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

}
