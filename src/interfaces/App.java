package interfaces;

public class App {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.swim();
        ship.run();
        ship.move();

        Swim ship1 = new Ship();
        ship1.run();
        ship1.swim();

        Swim duck = new Duck();
        Swim boat = new Boat();
        int a = Swim.i;

        Swim[] swims = new Swim[3];
        swims[0] = duck;
        swims[1] = boat;
        swims[2] = ship1;

        for (int i = 0; i < swims.length; i++) {
            swims[i].run();
        }
    }

    public void printSwim(Duck swim) {
        System.out.println("Плавает: " + swim.strSwim());
    }
    public void printSwim(Boat swim) {
        System.out.println("Плавает: " + swim.strSwim());
    }
}
