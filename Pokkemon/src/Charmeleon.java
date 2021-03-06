
public class Charmeleon extends Pokemon {
    Charmeleon(String pokenaam) {
        System.out.println("Charmeleon " + pokenaam + " created!");
        naam = pokenaam;
        System.out.println(this.naam);
        energytype.add("fire");
        hitpoints = 60;
        health = 60;

        weakness.add(2.0);
        weaknessType.add("Water");

        resistanceValues.add(10);
        resistanceNames.add("Lightning");

        attackNames.add("Head Butt");
        attackNames.add("Flare");

        attackValues.add(10);
        attackValues.add(30);
    }

}
