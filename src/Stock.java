public interface Stock {
    void addInvestor(Investor investor);
    void removeInvestor(Investor investor);
    void notifyInvestors(double priceChange);
}
