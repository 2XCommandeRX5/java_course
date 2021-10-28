package hw7;


import java.util.HashMap;

public class MarketManager {
    private     HashMap<String,Market> markets;

    public MarketManager() {
        this.markets = new HashMap<>();
    }

    public void addMarket(String name){
        Market market = new Market(name);
        markets.put(name, market);
    }

    public void listMarkets() {
        System.out.println("количество магазинов " + markets.keySet().size());
        for (String marketName : markets.keySet()) {

            System.out.println(marketName);
        }
    }

    public void addGoods (String mname, String name, int quant, double price) {
        Market m = markets.get(mname);
        if (m!=null){
            m.supply(name,quant,price);
        } else {
            System.out.println("маг не сущ" + mname);
            return;
        }
    }
    public int getProdAmount(String mname, String pname) {
        Market m = markets.get(mname);
        if (m!=null){
            return m.getProdAmount(pname);
        } else {
            System.out.println("маг не сущ" + mname);
            return 0;
        }
    }

    public void listGoods (String mname) {
        Market m = markets.get(mname);
        if (m!=null){
            m.listProds();
        } else {
            System.out.println("маг не сущ" + mname);
            return;
        }
    }

    public void sell (String mname, String pname, int quant) {
        Market m = markets.get(mname);
        if (m!=null){
            m.sellProd(pname, quant);
        } else {
            System.out.println("маг не сущ" + mname);
            return;
        }
    }

    public double profit (String name) {
        Market m = markets.get(name);
        return m.getProfit();
    }

}
