package company.stream;

public class Product {
    private int i;
    private String name;
    private int amount;
    public Product(int i, String name, int amount) {
        this.i = i;
        this.name = name;
        this.amount = amount;
    }
    public String getName(){
        return name;
    }
    public int getI(){
        return i;
    }
    public int amount(){return amount;}
    public Product minus(Product temp){
        return new Product(i, name, amount - temp.amount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "i=" + i +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
