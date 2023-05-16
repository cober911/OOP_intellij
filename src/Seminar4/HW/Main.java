package Seminar4.HW;
public class Main {
    public static void main(String[] args) {
        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("George", new Bow(), 30))
                    .add(new Archer("Bob", new Bow(), 25));
        
        Team<Assasin> assasinTeam = new Team<>();
        assasinTeam.add(new Assasin("Ecio",new Knife(), 20))
                    .add(new Assasin("Maria", new Knife(), 35));

        Team<Defender> defenderTeam = new Team<>();
        defenderTeam.add(new Defender("Dag", new Sword(), 38, new Shield()));

        System.out.println(archersTeam);
        System.out.println(assasinTeam);
        System.out.println(defenderTeam);
        System.out.println("--------------");
        
//        Battle placeOfBattle = new Battle(new Archer("Henry", new Bow(), 30),
//                               new Assasin("Jonny", new Knife(), 34));
//        Warrior winner = placeOfBattle.fight();
//
//        System.out.println(winner);

        System.out.println("------------");
        Battle battle = new Battle(new Defender("Jon", new Sword(), 38, new Shield()),
                new Assasin("Altair", new Knife(), 37));

        Warrior winner2 = battle.fight();
        System.out.println(winner2);
    }
    
}
