public class Farmer extends BaseHero{

    public Farmer(String name, int attack, int defense, int shoot, int[] damage, int health, int speed, int supply,
            int magic) {
        super(name, attack, defense, shoot, damage, health, speed, supply, magic);
    }

    public Farmer(String name){
        super(name, 1, 1, 0, new int[] {1, 1}, 1, 3, 1, 0);
    }

    @Override
    public String toString(){
        return super.toString();
    }
        
}
