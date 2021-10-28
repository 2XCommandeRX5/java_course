package hw7;

import jdk.nashorn.internal.ir.IfNode;

import java.util.HashMap;

public class Market {
    private String name;
    private double profit;
    private HashMap<String, Container> containers;

    public Market(String name ) {
        this.name = name;
        this.profit = 0;
        this.containers = new HashMap<>();
    }

    public void supply(String name, int quant, double price){
        Container product = containers.get(name);
        if (product != null) {
            product.setQuant(product.getQuant()+quant);
        } else {
            containers.put(name, new Container(name,quant,price));
        }
    }

    public int getProdAmount (String name) {
        Container product = containers.get(name);
        if (product!=null) {
            return product.getQuant();
        } else {
            System.out.println("товар не найден");
            return 0;
        }
    }

    public void listProds () {
        System.out.println(containers.keySet());
    }

    public void sellProd (String name, int quant){
        Container product = containers.get(name);
        if (product != null) {
        if (product.getQuant() >= quant) {
            product.setQuant(product.getQuant() - quant);
            setProfit(product.getPrice() * quant);
        } else {
            System.out.println("нет такого количества товара" + name);
        } } else {
            System.out.println("нет такого товара" + name);
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit += profit;
    }
}
