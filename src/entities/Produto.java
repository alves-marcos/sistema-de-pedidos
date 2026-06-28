package entities;

import org.w3c.dom.ls.LSOutput;

public class Produto {
    private String name;
    private static Integer contador = 1;
    private Double price;
    private Integer ID;

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
        this.ID = contador++;
    }

    public String getName() {
        return name;
    }

    public Integer getID() {
        return ID;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "Nome = " + name  +
                ", Preço = R$ " + price +
                ", ID = " + ID +
                "\n";
    }

    public void listarProdutos(){
        System.out.println("Nome = " + getName() + ", Preço = R$ " + getPrice() + ", ID = " + getID());
    }
}
