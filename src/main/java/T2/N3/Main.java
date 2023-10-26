package T2.N3;

/*Design a class that displays the price of several items on the screen.
Since you will also have to show them in various types of currency.
Make sure to add a Currency Converter class as Dependency Injection
to carry out the price correction based on the currency exchange.*/

public class Main {
    public static void main(String[] args) {
        Article article1 = new Article("Coca-Cola", 1.5);
        Article article2 = new Article("Fanta", 2.5);
        ShowPrice showPrice = new ShowPrice(new CurrencyExchange("USD"));
        showPrice.show(article1, "USD");
        showPrice.show(article1, "GBP");
        showPrice.show(article1, "AED");
        showPrice.show(article2, "USD");
        showPrice.show(article2, "GBP");
        showPrice.show(article2, "AED");
    }
}
