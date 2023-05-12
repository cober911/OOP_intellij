package Seminar1.HWTask2;

public class Main {
    public static void main(String[] args) {

        CofeVending cofeVending = new CofeVending();
        cofeVending.addDrink(new Drink("Nuri", 350, 100, 60))
                .addDrink(new Tea("Ahmad", 450, 100, 80, "green"))
                .addDrink(new Cofe("MeTrang", 120, 100, 150, "Arabica"))
                .addDrink(new Drink("Чаша", 450, 120, 40));

        cofeVending.outSpisok();

        Drink find = cofeVending.findDrink("Nuri");
        System.out.println(find);

        System.out.println("--Покупаем товар1--");
        Drink sold = cofeVending.sellDrink(find);   //Сдесь мы задаем имя товара который покупаем из переменной find
        System.out.println("Купили: " + sold);
        System.out.println("В автомате столько денег: " + cofeVending.getAmount());
        System.out.println("--Покупаем товар2--");
        Drink sold2 = cofeVending.sellDrink(cofeVending.findDrink("Ahmad"));//Сдесь мы задаем имя товара который покупаем с помоью метода поиска по списку.
        System.out.println("Купили: " + sold2);
        System.out.println("В автомате столько денег: " + cofeVending.getAmount());
        System.out.println("--Осталось товаров--");
        cofeVending.outSpisok();
        // Покупаем с exception
        try {
            Drink sold3 = cofeVending.sellDrink(cofeVending.findDrink("Ahmad"));
            System.out.println(sold3);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }

}
