import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements Stock {
    private List<Investor> investors = new ArrayList<>();
    private String stockSymbol;
    private double stockPrice;

    public ConcreteStock(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
    }

    @Override
    public void addInvestor(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors(double priceChange) {
        stockPrice = priceChange;
        for (Investor investor : investors) {
            investor.update(stockSymbol, priceChange);
        }
    }

}
