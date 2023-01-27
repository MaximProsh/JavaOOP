public class Arbalester extends BaseHero {

    public Arbalester(String name, int attack, int defense, int shoot, int[] damage, int health, int speed, int supply,
            int magic) {
        super(name, attack, defense, shoot, damage, health, speed, supply, magic);
        //TODO Auto-generated constructor stub
    }

    public Arbalester(String name){
        super(name, 6, 3, 16, new int[] {2, 3}, 10, 4, 0, 0);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
