package app;

@Product(name = "orange", quota = 12)
public class ProductInfo {

    @Product(name = "grape", quota = 11)
    public String getData() {
        return "No data...";
    }
}
