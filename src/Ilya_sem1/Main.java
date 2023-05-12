package Ilya_sem1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("watter", 50);
        Drink drink = new Drink("pivo", 80, 8);


        String outProduct = drink.toString();
        System.out.println(outProduct);
//        String outProduct = product.toString();
//        System.out.println(outProduct);
    }
}
