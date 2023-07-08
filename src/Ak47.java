public class Ak47 extends Arsenal implements Printable {
    private double calibre;
    private String magazine;

    public Ak47(String name, String model, int year, double calibre, String magazine) {
        super(name, model, year);
        this.calibre = calibre;
        this.magazine = magazine;
    }


    public double getCalibre() {
        return calibre;
    }

    public String getMagazine() {
        return magazine;
    }



    @Override
    public void print() {
        System.out.println(getInfo()+"\nCalibre: " + getCalibre() +
                "\nMagazine: " + getMagazine() );
    }
}