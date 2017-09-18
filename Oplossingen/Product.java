package be.oak3.java8;

import java.util.Comparator;

public abstract class Product implements Comparable<Product> {

    // INSTANCE VARIABELEN
    private int productNummer;
    private String merk;
    private String naam;
    private int volume;
    private double prijs;

    // CONSTRUCTOR
    public Product(int productNummer, String merk, String naam, int volume,
                   double prijs) {
        this.setProductNummer(productNummer);
        this.setMerk(merk);
        this.setNaam(naam);
        this.setPrijs(prijs);
        this.setVolume(volume);
    }

    public static Comparator<Product> sorteerOpMerknaam() {

        return Comparator.comparing(Product::getMerk);

        //return (p1, p2) -> p1.getMerk().compareTo(p2.getMerk());

//        return new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getMerk().compareTo(o2.getMerk());
//            }
//        };
    }

    // GETTERS
    public int getProductNummer() {
        return productNummer;
    }

    // SETTERS
    public void setProductNummer(int productNummer) {
        this.productNummer = productNummer;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    // ANDERE METHODES
    public String getProductCode() {

        String result = merk.substring(0, 3) + naam.substring(0, 3) + String.valueOf(volume);
        return result.toUpperCase().replaceAll(" ", "_");
    }

    // OVERSCHRIJVEN VAN METHODS
    @Override
    public String toString() {

        return String.format(
                "%d %s %-20s %10s %-24s %10s %3sml %8s %4.2f %5s %s",
                productNummer, "Merk:", merk, "Naam:", naam, "Volume:", volume,
                "Prijs:", prijs, "Code:", getProductCode());
    }

    @Override
    public int compareTo(Product o) {
        return this.productNummer - o.productNummer;
    }
}
