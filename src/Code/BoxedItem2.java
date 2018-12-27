package Code;

public class BoxedItem2 implements InsurableItem  {

    private String descript;
    private int price;
    private int weight;
    private boolean haz;

    /** Construtor */
    public BoxedItem2(String dec, int p, int w, boolean h) {
        descript = dec;
        price = p;
        weight = w;
        haz = h;
    }

    public String description() { return descript; }
    public int listPrice() { return price; }
    public int lowestPrice() { return price/2; }
    public int weight() { return weight; }
    public boolean isHazardous() { return haz; }
    public int insuredValue() { return price*2; }
}
