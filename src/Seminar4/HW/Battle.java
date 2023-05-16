package Seminar4.HW;
public class Battle {
    private Warrior one;
    private Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
        
    }
    public Warrior fight() {
        while(one.getHealthPoint() > 0 && two.getHealthPoint() > 0){
            int hitOne = one.hit();
            int blockOne = one.block();
            System.out.printf("One warrior hit damage %s. \n", hitOne);
            two.setHealthPoint(two.getHealthPoint() + blockOne - hitOne);
            System.out.printf("Two warrior have block %s. \n", blockOne);
            System.out.printf("Two warrior have healthPoint %s. \n", two.getHealthPoint());
            if(two.getHealthPoint() <= 0){
                return one;
            }
            int hitTwo = two.hit();
            int blockTwo = two.block();
            System.out.printf("Two warrior hit damge %s. \n", hitTwo);
            one.setHealthPoint(one.getHealthPoint() + blockTwo - hitTwo);
            System.out.printf("Two warrior have block %s. \n", blockTwo);
            System.out.printf("One warrior have healthPoint %s. \n", one.getHealthPoint());
        }
        return two;
    }
}
