package local.study.builder;

public class ProductBuilder {

    private final Product product;

    public ProductBuilder() {
        this.product = new Product();
    }

    public ProductBuilder name(String name) {
        product.setName(name);
        return this;
    }

    public ProductBuilder mark(String mark) {
        product.setMark(mark);
        return this;
    }

    public ProductBuilder model(String model) {
        product.setModel(model);
        return this;
    }

    public ProductBuilder height(double height) {
        product.setHeight(height);
        return this;
    }

    public ProductBuilder weight(double weight) {
        product.setWeight(weight);
        return this;
    }

    public ProductBuilder guaranteePeriod(int guaranteePeriod) {
        product.setGuaranteePeriod(guaranteePeriod);
        return this;
    }

    public Product build() {
        return product;
    }

}
