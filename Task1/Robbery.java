public class Robbery extends BaseHero {

    public Robbery(String name, int attack, int defense, int shoot, int[] damage, int health, int speed, int supply,
            int magic) {
        super(name, attack, defense, shoot, damage, health, speed, supply, magic);
        //TODO Auto-generated constructor stub
    }

    public Robbery(String name){
        super(name, 8, 3, 0, new int[] {2, 4}, 10, 6, 0 , 0);
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
}