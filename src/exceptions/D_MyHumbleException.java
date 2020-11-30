package exceptions;

public class D_MyHumbleException extends IllegalAccessException {
    public D_MyHumbleException() {
        super("Это очень скромное исключение");
    }
}
