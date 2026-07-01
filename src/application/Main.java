package application;

import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;
import services.PedidoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();

        PedidoService service = new PedidoService();

        int opcao;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Criar pedido");
            System.out.println("4 - Adicionar item ao pedido");
            System.out.println("5 - Remover item do pedido");
            System.out.println("6 - Alterar status do pedido");
            System.out.println("7 - Resumo do pedido");
            System.out.println("8 - Listar pedidos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    produtos.add(new Produto(nome, preco));

                    System.out.println("Produto cadastrado.");

                    break;

                case 2:

                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {

                        for (Produto p : produtos) {
                            System.out.println(p);
                        }

                    }

                    break;

                case 3:

                    Pedido pedido = service.criarPedido();

                    pedidos.add(pedido);

                    System.out.println("Pedido criado. ID: " + pedido.getId());

                    break;

                case 4:

                    if (pedidos.isEmpty()) {
                        System.out.println("Crie um pedido primeiro.");
                        break;
                    }

                    System.out.print("ID do pedido: ");
                    int idPedido = sc.nextInt();

                    Pedido pedidoSelecionado = service.buscarPedido(pedidos, idPedido);

                    if (pedidoSelecionado == null) {

                        System.out.println("Pedido não encontrado.");
                        break;

                    }

                    System.out.println("\nProdutos:");

                    for (Produto p : produtos) {
                        System.out.println(p);
                    }

                    System.out.print("ID do produto: ");
                    int idProduto = sc.nextInt();

                    Produto produto = service.buscarProduto(produtos, idProduto);

                    if (produto == null) {

                        System.out.println("Produto inexistente.");
                        break;

                    }

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    pedidoSelecionado.adicionarItem(
                            new ItemPedido(produto, quantidade)
                    );

                    System.out.println("Item adicionado.");

                    break;

                case 5:

                    System.out.print("ID do pedido: ");
                    idPedido = sc.nextInt();

                    pedidoSelecionado = service.buscarPedido(pedidos, idPedido);

                    if (pedidoSelecionado == null) {

                        System.out.println("Pedido não encontrado.");
                        break;

                    }

                    System.out.print("ID do produto: ");
                    idProduto = sc.nextInt();

                    pedidoSelecionado.removerItem(idProduto);

                    System.out.println("Item removido.");

                    break;

                case 6:

                    System.out.print("ID do pedido: ");
                    idPedido = sc.nextInt();

                    pedidoSelecionado = service.buscarPedido(pedidos, idPedido);

                    if (pedidoSelecionado == null) {

                        System.out.println("Pedido inexistente.");
                        break;

                    }

                    System.out.println("1 - PENDENTE");
                    System.out.println("2 - PAGO");
                    System.out.println("3 - ENVIADO");
                    System.out.println("4 - CANCELADO");

                    int status = sc.nextInt();

                    switch (status) {

                        case 1:
                            pedidoSelecionado.setStatus(StatusPedido.PENDENTE);
                            break;

                        case 2:
                            pedidoSelecionado.setStatus(StatusPedido.PAGO);
                            break;

                        case 3:
                            pedidoSelecionado.setStatus(StatusPedido.ENVIADO);
                            break;

                        case 4:
                            pedidoSelecionado.setStatus(StatusPedido.CANCELADO);
                            break;

                        default:
                            System.out.println("Status inválido.");

                    }

                    break;

                case 7:

                    System.out.print("ID do pedido: ");
                    idPedido = sc.nextInt();

                    pedidoSelecionado = service.buscarPedido(pedidos, idPedido);

                    if (pedidoSelecionado == null) {

                        System.out.println("Pedido não encontrado.");
                        break;

                    }

                    System.out.println(pedidoSelecionado.resumoPedido());

                    break;

                case 8:

                    if (pedidos.isEmpty()) {

                        System.out.println("Nenhum pedido.");

                    } else {

                        for (Pedido p : pedidos) {

                            System.out.println(
                                    "Pedido " + p.getId()
                                            + " - "
                                            + p.getStatus()
                            );

                        }

                    }

                    break;

                case 0:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 0);

        sc.close();

    }

}