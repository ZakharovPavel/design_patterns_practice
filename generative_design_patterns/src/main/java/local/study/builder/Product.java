package local.study.builder;

public class Product {

    private String name;
    private String mark;
    private String model;
    private double height;
    private double weight;
    private int guaranteePeriod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", guaranteePeriod=" + guaranteePeriod +
                '}';
    }
}
