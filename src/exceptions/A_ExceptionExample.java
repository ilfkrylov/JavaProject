package exceptions;

public class A_ExceptionExample {

    public static void main(String[] args) {
        A_ExceptionExample example = new A_ExceptionExample();
        example.example1();
    }

    public void example1() {
        try {
            int a = 0;
            int b = 57 / a;
            System.out.println("А вот эта строка выполняться не будет");
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        System.out.println("End");
    }

    public void example2() {
        try {
            int a = 0;
            int[] array = new int[5];
            array[100] = 57 / a;
            System.out.println("А вот эта строка выполняться не будет");
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }

    public void example3() {
        try {
            int a = 2;
            int[] array = new int[5];
            array[100] = 57 / a;
            System.out.println("А вот эта строка выполняться не будет");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }

    public void example4() {
        try {
            int a = 2;
            int[] array = new int[5];
            array[100] = 57 / a;
            System.out.println("А вот эта строка выполняться не будет");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        // Недостижимый код
        //catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println(e.toString());
        //}
    }
}
