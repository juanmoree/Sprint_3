package T2.N3;

public class ShowPrice {
    // Dependency Injection
    private CurrencyExchange currencyExchange;
    public ShowPrice(CurrencyExchange currencyExchange) {
        this.currencyExchange = currencyExchange;
    }
    public void show(Article article, String exchangeType) {
        System.out.println("Name: " + article.getName());
        System.out.println("Price: " + currencyExchange.convert(article.getPrice(), exchangeType));
        System.out.println("Exchange type: " + exchangeType);
    }
}
