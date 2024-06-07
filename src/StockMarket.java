public class StockMarket {
    public static void main(String[] args) {
        Stock appleStock = new ConcreteStock("APPLE",100);
        Stock dellStock = new ConcreteStock("DELL",100);

        Investor tomInvestor = new SimpleInvestor("Tom");
        Investor bobInvestor = new SimpleInvestor("Bob");
        appleStock.addInvestor(tomInvestor);
        appleStock.addInvestor(bobInvestor);
        dellStock.addInvestor(tomInvestor);

        appleStock.notifyInvestors(100);
        appleStock.notifyInvestors(40);
        appleStock.notifyInvestors(10);
        appleStock.notifyInvestors(5);
        dellStock.notifyInvestors(300);
        dellStock.notifyInvestors(200);

    }
}
