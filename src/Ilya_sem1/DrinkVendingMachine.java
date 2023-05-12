package Ilya_sem1;

import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine{
    private ArrayList<Drink> drinkList;
    public DrinkVendingMachine(String firstMachine) {
        super(firstMachine);
        drinkList = new ArrayList<Drink>();
    }
    public void addDrink(Drink dr){
        drinkList.add(dr);
    }

    public Drink getProductByName (String name){
        for (int i = 0; i < drinkList.size() ; i++) {
            if(drinkList.get(i).getName().equals(name)){
                return drinkList.get(i);
            }
        }
        return null;
    }

}
