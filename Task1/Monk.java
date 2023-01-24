public class Monk extends BaseHero {

    public Monk(String name, int attack, int defense, int shoot, int[] damage, int health, int speed, int supply,
            int magic) {
        super(name, attack, defense, shoot, damage, health, speed, supply, magic);
        //TODO Auto-generated constructor stub
    }
    
    public Monk(String name){
        super(name, 12, 7 ,0, new int[] {-4}, 30, 5, 0, 1);
    }


    @Override
    public String toString(){
        return super.toString();
    }
}
