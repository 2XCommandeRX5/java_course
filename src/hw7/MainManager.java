package hw7;

public class MainManager {
    public static void main(String[] args) {
        MarketManager mm = new MarketManager();
        mm.addMarket("Magnit");
        mm.addMarket("Dixi");
        mm.listMarkets();
        mm.addGoods("Magnit","tomato",10,25);
        mm.addGoods("Magnit","melon",11,20);
        System.out.println(mm.getProdAmount("Magnit", "melon"));
        mm.listGoods("Magnit");
        mm.sell("Magnit","tomato", 5);
        mm.sell("Magnit","tomato", 11);
        mm.sell("Magnit","tomato", 12);
        System.out.println( mm.profit("Magnit"));
    }
}
