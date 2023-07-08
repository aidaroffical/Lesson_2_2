public  class Arsenal implements Printable {
    private String name;
    private String model;
    private int year;


    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Arsenal(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public String getInfo(){
        return "\nName:" + this.name +
                "\nModel: "+ this.model +
                "\nYear: "+ this.year;


    }

    @Override
    public void print() {
        System.out.println(getInfo());
    }
}