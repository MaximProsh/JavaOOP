public class Wizard extends BaseHero {

    public Wizard(String name, int attack, int defense, int shoot, int[] damage, int health, int speed, int supply,
            int magic) {
        super(name, attack, defense, shoot, damage, health, speed, supply, magic);
        //TODO Auto-generated constructor stub
    }
    
    public Wizard(String name){
        super(name, 17, 12, 0, new int[] {-5}, 30, 9, 0, 1);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
