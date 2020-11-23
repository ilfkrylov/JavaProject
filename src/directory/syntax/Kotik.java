package directory.syntax;

public class Kotik {
    int prettiness;
    int weight;
    String name;
    String meow;

    //Конструктор без параметров, он идентичен конструктору по умолчанию, 
    //который сюда бы подставила Java,    
    // Но она его не подставит, по той причине, 
    //что ниже определяется другой конструктор, с параметрами.
    public Kotik() {
    }

    public Kotik(int prettiness, int weight, String name, String meow) {this.prettiness = prettiness;
        this.weight = weight;this.name = name;this.meow = meow;}


    void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }

    int giveMeMoney() {
        return 100;
    }

    void sayMeow() {
        System.out.println(name + " говорит " + meow);
    }
}
