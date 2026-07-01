package services;

import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

import java.util.List;

public class PedidoService {

    public Pedido criarPedido() {

        return new Pedido(StatusPedido.PENDENTE);

    }

    public Produto buscarProduto(List<Produto> produtos, int id) {

        for (Produto produto : produtos) {

            if (produto.getID() == id) {

                return produto;

            }

        }

        return null;

    }

    public Pedido buscarPedido(List<Pedido> pedidos, int id) {

        for (Pedido pedido : pedidos) {

            if (pedido.getId() == id) {

                return pedido;

            }

        }

        return null;

    }

}