import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> farmer = new ArrayList<>();
        String[] farmerNames = {"Геродот", "Анахорет", "Фелоний", "Флавий", "Тиберий"};
        for (String name : farmerNames) {
            farmer.add(new Farmer(name));
        }
        for (BaseHero characteBaseHero : farmer) {
            System.out.println(characteBaseHero);
        }
        System.out.println("----------------------");

        ArrayList<BaseHero> arbalester = new ArrayList<>();
        String[] arbalesterNames = {"Геродот", "Анахорет", "Фелоний", "Флавий", "Тиберий"};
        for (String name : arbalesterNames) {
            arbalester.add(new Arbalester(name));
        }
        for (BaseHero characteBaseHero : arbalester) {
            System.out.println(characteBaseHero);
        }
        System.out.println("----------------------");

        ArrayList<BaseHero> monk = new ArrayList<>();
        String[] monkNames = {"Геродот", "Анахорет", "Фелоний", "Флавий", "Тиберий"};
        for (String name : monkNames) {
            monk.add(new Monk(name));
        }
        for (BaseHero characteBaseHero : monk) {
            System.out.println(characteBaseHero);
        }
        System.out.println("----------------------");

        ArrayList<BaseHero> pikeman = new ArrayList<>();
        String[] pikemanNames = {"Геродот", "Анахорет", "Фелоний", "Флавий", "Тиберий"};
        for (String name : pikemanNames) {
            pikeman.add(new Pikeman(name));
        }
        for (BaseHero characteBaseHero : pikeman) {
            System.out.println(characteBaseHero);
        }
        System.out.println("----------------------");

        ArrayList<BaseHero> robbery = new ArrayList<>();
        String[] robberyNames = {"Геродот", "Анахорет", "Фелоний", "Флавий", "Тиберий"};
        for (String name : robberyNames) {
            robbery.add(new Robbery(name));
        }
        for (BaseHero characteBaseHero : robbery) {
            System.out.println(characteBaseHero);
        }
        System.out.println("----------------------");

        ArrayList<BaseHero> sniper = new ArrayList<>();
        String[] sniperNames = {"Геродот", "Анахорет", "Фелоний", "Флавий", "Тиберий"};
        for (String name : sniperNames) {
            sniper.add(new Sniper(name));
        }
        for (BaseHero characteBaseHero : sniper) {
            System.out.println(characteBaseHero);
        }
        System.out.println("----------------------");

        ArrayList<BaseHero> wizard = new ArrayList<>();
        String[] wizardNames = {"Геродот", "Анахорет", "Фелоний", "Флавий", "Тиберий"};
        for (String name : wizardNames) {
            wizard.add(new Wizard(name));
        }
        for (BaseHero characteBaseHero : wizard) {
            System.out.println(characteBaseHero);
        }   
    }

}
