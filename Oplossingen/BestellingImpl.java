package be.oak3.java8;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BestellingImpl implements Bestelling {

    // INSTANCE VARIABELEN
    private List<Product> producten;
    private static int productNummer = 1000;

    // CONSTRUCTOR voor bestellingen aan te maken
    public BestellingImpl() {
        producten = new ArrayList<>();
    }

    // ANDERE METHODES
    public void voegProductToe(Product product) {
        product.setProductNummer(productNummer);
        producten.add(product);
        productNummer++;
    }

    @Override
    public void sorteerOpMerk() {
        producten.stream().sorted(Product.sorteerOpMerknaam()).forEach(System.out::println);
    }

    @Override
    public void toonPerMerk(String merk) {
        producten.stream().filter(product -> product.getMerk()
                .equalsIgnoreCase(merk)).forEach(System.out::println);
    }

    @Override
    public List<Product> lijstVanBepaaldMerk(String merk) {
        return producten.stream().filter(product -> product.getMerk()
                .equalsIgnoreCase(merk)).collect(Collectors.toList());
    }

  
    @Override
    public void toonParfums() {
        producten.stream().filter(product -> product instanceof Parfum).forEach(System.out::println);
    }

    @Override
    public Product zoekDuursteProduct() {
        return producten.stream().max(Comparator.comparingDouble(Product::getPrijs)).orElseThrow(RuntimeException::new);
    }

    @Override
    public void sorteer() {
        List<Product> n = producten.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        n.forEach(System.out::println);
    }

    @Override
    public void sorteerOpVolume() {
        producten.stream().sorted(Comparator.comparingInt(Product::getVolume)).forEach(System.out::println);
    }

    @Override
    public void toonGoedkopeProducten() {
        producten.stream().filter(product -> product.getPrijs() < 50).forEach(System.out::println);
    }

    // Implementeren van totalePrijs uit Interface Berekenbaar!
    @Override
    public double totalePrijs() {
        return producten.stream().mapToDouble(Product::getPrijs).sum();
    }
}
