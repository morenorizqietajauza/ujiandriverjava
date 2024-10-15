public class Guitar extends StringInstruments{
    protected boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Guitar() {
        isElectric=false;
    }
    public Guitar(String name, double price, int numStrings, boolean isElectric) {
        super(name, price, numStrings);
        this.isElectric=isElectric;
    }

    @Override
    public void print() {
        super.print();
        if (isElectric==true) {
            System.out.println("Jenis gitar "+name+" adalah gitar listrik");
        } else {
            System.out.println("Gitar "+name+" adalah gitar akustik");
        }
    }
}