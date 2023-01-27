import java.util.Arrays;

public class BaseHero {
    String name;
    Integer attack, defense, shoot, health, speed, supply, magic;
    int[] damage;
    

    public BaseHero(String name, int attack, int defense, 
    int shoot, int[] damage, int health, int speed, int supply, int magic) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.shoot = shoot;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.supply = supply;
        this.magic = magic;
    }
    
    @Override
    public String toString(){
        return "Name: " + name +
        " Attack: " + attack +
        " Defense: " + defense +
        " Shoot: " + shoot +
        " Damage: "+ Arrays.toString(damage) +
        " Health: " + health +
        " Speed: " + speed +
        " Supply: " + supply +
        " Magic: " + magic;
    }
}
