package stockIndicators.entities;

public class StockInfo {

    private String stockID;

    private int priceOfEarnings;

    private int priceOfBookValue;

    public StockInfo(String stockID, int priceOfEarnings, int priceOfBookValue) {
        this.stockID = stockID;
        this.priceOfEarnings = priceOfEarnings;
        this.priceOfBookValue = priceOfBookValue;
    }

    public String getStockID() {
        return stockID;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    public int getPriceOfEarnings() {
        return priceOfEarnings;
    }

    public void setPriceOfEarnings(int priceOfEarnings) {
        this.priceOfEarnings = priceOfEarnings;
    }

    public int getPriceOfBookValue() {
        return priceOfBookValue;
    }

    public void setPriceOfBookValue(int priceOfBookValue) {
        this.priceOfBookValue = priceOfBookValue;
    }
}
