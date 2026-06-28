package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> listaProd = new ArrayList<>();

        System.out.println("========== MENU DE PEDIDOS ==========");
        System.out.println("    1 - Cadastrar produto\n" +
                "    2 - Listar produtos\n" +
                "    3 - Criar pedido\n" +
                "    4 - Sair");
        System.out.println("====================");
        System.out.print("Escolha o que deseja fazer: ");
        int escolha = sc.nextInt();
        sc.nextLine();

        while (escolha != 4){
            if (escolha == 1){
                System.out.println("=================================================");
                System.out.print("Insira o nome do Produto que deseja cadastrar: ");
                String name = sc.nextLine();
                System.out.print("Insira o preço do Produto: ");
                double preco = sc.nextDouble();
                Produto produto = new Produto(name, preco);

                listaProd.add(produto);

                System.out.println("========== MENU DE PEDIDOS ==========");
                System.out.println("    1 - Cadastrar produto\n" +
                        "    2 - Listar produtos\n" +
                        "    3 - Criar pedido\n" +
                        "    4 - Sair");
                System.out.println("====================");
                System.out.print("Escolha o que deseja fazer: ");
                escolha = sc.nextInt();
                sc.nextLine();


            } else if (escolha == 2) {
                for (Produto produto : listaProd){
                    produto.listarProdutos();
                }

                System.out.println("    1 - Cadastrar produto\n" +
                        "    2 - Listar produtos\n" +
                        "    3 - Criar pedido\n" +
                        "    4 - Sair");
                System.out.println("====================");
                System.out.print("Escolha o que deseja fazer: ");
                escolha = sc.nextInt();
                sc.nextLine();



                
            }
        }





        sc.close();
    }
}
