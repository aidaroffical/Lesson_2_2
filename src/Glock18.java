public class Glock18 extends Arsenal implements Printable{
    private int maximalSpeed;
    private String country;

    public Glock18(String name, String model, int year, int maximalSpeed, String country) {
        super(name, model, year);
        this.maximalSpeed = maximalSpeed;
        this.country = country;
    }
    public int getMaximalSpeed() {
        return maximalSpeed;
    }

    public String getCountry() {
        return country;
    }



    @Override
    public void print() {
        System.out.println(getInfo()+ "\nMaximal speed: " + getMaximalSpeed()+
                "\nCountry: " + getCountry() );
    }
}