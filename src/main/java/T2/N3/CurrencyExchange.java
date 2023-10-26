package T2.N3;

public class CurrencyExchange {
    private double exchangeRate;
    private String exchangeType;

    public CurrencyExchange(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public double convert(double price, String exchangeType) {
        switch (exchangeType) {
            case "USD":
                exchangeRate = 1.17;
                break;
            case "GBP":
                exchangeRate = 0.85;
                break;
            case "AED":
                exchangeRate = 4.29;
                break;
        }
        return price * exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getExchangeType() {
        return exchangeType;
    }
}
