public class Awp extends Arsenal implements Printable{
    private int range;
    private String chuck;

    public Awp(String name, String model, int year, int range, String chuck) {
        super(name, model, year);
        this.range = range;
        this.chuck = chuck;
    }
    public int getRange() {
        return range;
    }

    public String getChuck() {
        return chuck;
    }



    @Override
    public void print() {
        System.out.println( getInfo()+"\nRange: "+ getRange() +
                "\nChuck: "+ getChuck());

    }
}