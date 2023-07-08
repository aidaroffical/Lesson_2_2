public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                createObject("Ak47"),
                createObject("Glock"),
                createObject("AWP")};

        for (Printable printable : printables) {
            if (printable != null) {
                printable.print();
            }
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Ak47":
                Ak47 ak47 = new Ak47(" Ak47 ", "Automat", 1947, 7.62, "30");
                return ak47;
            case "Glock":
                Glock18 glock = new Glock18(" Glock18", "Automatic pistol", 1987, 1200, "Austria");
                return glock;
            case "AWP":
                Awp awp = new Awp(" Arctic Warfare", "Sniper", 2010, 1500, "Winchester Magnum");
                return awp;
        }
        return null;
    }
}