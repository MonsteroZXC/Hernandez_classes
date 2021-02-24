package mcm.edu.ph.hernandez_classes;

public class Hero {
    String heroName="";
    int heroLvl=0;
    int baseHealth=0;
    int baseMana=0;
    Double agility=0.0;
    Double strength=0.0;
    Double intelligence=0.0;
    Double armor=0.0;

    int totalHealth(Double strength, int baseHealth){
        return (int)(this.strength *20)+ this.baseHealth;
    }

}
