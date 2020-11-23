package interfaces;

public interface Swim {
    public static final int i = 0;

    public abstract void swim();
    public abstract String strSwim();

    default void run() {
        System.out.println("Я бегу");
    }
}
