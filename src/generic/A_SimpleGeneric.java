package generic;

public class A_SimpleGeneric<TypeParameter> {

    public void autobox() {
        int a = 5;
        Integer b = a;
        int c = b;

        Character ch = 'c';
        char d = ch;

        Byte aByte = (byte) 12;

        Boolean isB = true;

        Double aDouble = 1.0d;
    }

    public void info(TypeParameter param) {
        System.out.println("Я работаю с типом: " + param.getClass().getSimpleName());
    }

    public static void main(String[] args) {

        A_SimpleGeneric<String> stringSimpleGeneric = new A_SimpleGeneric<>();
        stringSimpleGeneric.info("some string");

        A_SimpleGeneric<Integer> integerSimpleGeneric = new A_SimpleGeneric<>();
        integerSimpleGeneric.info(5);

        //Так нельзя, потому что считается что это объекты разных классов
        //integerSimpleGeneric = stringSimpleGeneric;
    }
}
