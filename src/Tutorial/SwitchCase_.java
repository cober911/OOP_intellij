package Tutorial;

public class SwitchCase_ {
    public static void main(String[] args) {
        int a = 2;
        switch(a){
            case 1:
                System.out.println("один");
            case 2:
                System.out.println("два");
                break;
            case 3:
                System.out.println("три");
            case 4:
                System.out.println("четыре");
            default:
                System.out.println("по дефолту");
        }
    }

}
