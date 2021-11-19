package labs_examples.my_practices.myproject;

public class Products implements Product_Features {
    private String product_name;
    private String model;
    private int product_id;
    private double product_price;

    public Products(String product_name, String model, int product_id, double product_price) {
        this.product_name = product_name;
        this.model = model;
        this.product_id = product_id;
        this.product_price = product_price;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_name='" + product_name + '\'' +
                ", model='" + model + '\'' +
                ", product_id=" + product_id +
                ", product_price=" + product_price +
                '}';
    }

    @Override
    public void description() {
        System.out.println("'Model-T1 is a strong vacuum machine for small areas." +
                "\nIt has a long batter-life." +
                "\nIt can be programmed with two user options which are high and max!'");
    }
}