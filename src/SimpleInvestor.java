public class SimpleInvestor implements Investor {
    private String name;
    private Strategy strategy;

    public SimpleInvestor(String name) {
        this.name = name;
        this.strategy = Strategy.MonitorOnly;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Strategy adaptStrategy() {
        return strategy;
    }

    @Override
    public void update(String stockSymbol, double priceChange) {
        System.out.print(getName() + " was notified by the price change in " +stockSymbol + ": $" + priceChange);
        if (priceChange < 50) {
            strategy = Strategy.HedgingStrategies;
            System.out.println(" and changed their strategy to " +strategy);
        } else if (priceChange > 200) {
            strategy = Strategy.QuickTransactions;
            System.out.println(" and changed their strategy to " +strategy);
        } else{
            System.out.println(" and decided to do nothing");
        }
    }
}