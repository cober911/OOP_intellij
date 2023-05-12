package Seminar1.HWTask2;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class CofeVending {
    List<Drink> list = new ArrayList<>();
    private int amount = 0;
    public int getAmount() {
        return amount;
    }

    public CofeVending addDrink(Drink drink) {
        list.add(drink);
        return this;
    }

    public List<Drink> getList() {
        return list;
    }

    public void outSpisok(){
        for (int i = 0; i < getList().size(); i++) {
            System.out.println(getList().get(i));
        }
    }

    public Drink findDrink(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                return getList().get(i);
            }
        }
        return null;
    }

    public Drink sellDrink(Drink drink){
        try {
            Drink drinkFound = findDrink(drink.getName());
            getList().remove(drinkFound);
            amount += drinkFound.getCost();
            return drinkFound;
        } catch (Exception ex){
            throw new RuntimeException("Товвр не найден");
        }
    }
}
