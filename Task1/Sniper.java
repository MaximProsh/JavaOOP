public class Sniper extends BaseHero {

    public Sniper(String name, int attack, int defense, int shoot, int[] damage, int health, int speed, int supply,
            int magic) {
        super(name, attack, defense, shoot, damage, health, speed, supply, magic);
        //TODO Auto-generated constructor stub
    }
    
    public Sniper(String name){
        super(name, 12, 10, 32, new int[] {8, 10}, 15, 9, 0, 0);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
