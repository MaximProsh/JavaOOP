public class Pikeman extends BaseHero {

    public Pikeman(String name, int attack, int defense, int shoot, int[] damage, int health, int speed, int supply,
            int magic) {
        super(name, attack, defense, shoot, damage, health, speed, supply, magic);
        //TODO Auto-generated constructor stub
    }
    
    public Pikeman(String name){
        super(name, 4, 5, 0, new int[] {1, 3}, 10, 4, 0, 0);
    }


    @Override
    public String toString(){
        return super.toString();
    }
}
