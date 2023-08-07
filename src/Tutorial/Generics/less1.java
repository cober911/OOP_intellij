package Tutorial.Generics;

import java.io.Console;

public class less1 {
    static class Gen<T> {
        T ob;

        public Gen(T ob) {
            this.ob = ob;
        }

        public T getOb() {
            return ob;
        }

        void showType() {
           System.out.println("Типом Т является: " + ob.getClass().getName());
        }

   }


    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        iOb.showType();
        System.out.println("Значение: " + iOb.getOb()+"\n");

        Gen<String> strOb = new Gen<>("Текст сообщения");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("значение: " + str);
        }
    }