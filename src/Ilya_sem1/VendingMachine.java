package Ilya_sem1;

import java.util.ArrayList;

public class VendingMachine {
    private String name;
    protected ArrayList<Product> productList;

    public VendingMachine(String firstMachine) {
        this.name = firstMachine;
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public Product getProductByName (String name){
        for (int i = 0; i < productList.size() ; i++) {
            if(productList.get(i).getName().equals(name)){
                return productList.get(i);
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return String.format("%s, %s", super.toString());
    }
}
