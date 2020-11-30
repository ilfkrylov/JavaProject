package exceptions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class F_ThrowsCheckedEx {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            someMethod();
        } catch (ClassNotFoundException e) {
            System.out.println("Перехватываем исключение из метода someMethod");
            e.printStackTrace();
        }
    }

    public static void someMethod() throws ClassNotFoundException {
        System.out.println("Выбрасываем тестовое проверяемое исключение");
        throw new ClassNotFoundException("Созданное для примера исключение");
    }

    public static void read() {
            InputStream inputStream = new ByteArrayInputStream(new byte[5]);
            // inputStream.read();
    }
}
