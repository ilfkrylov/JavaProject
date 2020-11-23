package oop.encapsulation.model;

public class Person {
    public String name;
    public int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printAll() {
        printName();
        printWeight();
    }

    private void printName() {
        System.out.println("Имя: " + name);
    }

    private void printWeight() {
        System.out.println("Вес: " + weight);
    }


//     private double weight;
//
//    public void setName(String name) {
//        if (name == null) {
//            System.out.println("Так делать нельзя");
//        } else {
//            this.name = name;
//        }
//    }
//
//    public double getWeightDouble() {
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        if (weight < 0) {
//            System.out.println("Так делать нельзя");
//        } else {
//            this.weight = weight;
//        }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        Person p = (Person) o;
//        boolean b1 = this.name.equals(p.name);
//        return b1;
//    }
}
