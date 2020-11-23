package directory.syntax;

public class Loops {

    public void whileLoop() {
        int n = 10;
        while (n > 0) {
            System.out.println(" тaкт " + n);
            n--;
        }
    }

    public void doWhileLoop() {
        int n = 10;
        do {
            System.out.println(" тaкт " + n);
            n--;
        } while (n > 0);

    }

    public void forLoop() {
        for (int n = 10; n > 0; --n) {
            System.out.println(" тaкт " + n);
        }
    }

}
