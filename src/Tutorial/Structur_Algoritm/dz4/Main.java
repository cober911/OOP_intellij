package Tutorial.Structur_Algoritm.dz4;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79005554433", "Андрей");
        res = hashMap.put("+79005554432", "Лола");
        res = hashMap.put("+79005554432", "Молли1");
        res = hashMap.put("+79005554433", "Молли2");
        res = hashMap.put("+79005554434", "Молли3");
        res = hashMap.put("+79005554435", "Молли4");
        res = hashMap.put("+79005554436", "Молли5");
        res = hashMap.put("+79005554437", "Молли6");
        res = hashMap.put("+79005554438", "Молли7");
        res = hashMap.put("+79005554439", "Молли8");

        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }
    }
}