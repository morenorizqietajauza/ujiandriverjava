//superclass
public class Instruments {
    protected String name;
    protected double price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

public Instruments() {

    name="";
    price=0;
}
public Instruments(String name, double prtice) {
    this.name=name;
    this.price=price;
}

public void print() {
    System.out.println("Nama: "+name);
    System.out.println("Harga: "+price);

}

 }
