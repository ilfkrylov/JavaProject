
public class EnumValues {

    public void example1() {
        for (MyHumbleEnum val : MyHumbleEnum.values()) {
            System.out.println(val.toString());
        }
    }

    public void example2() {
        for (MyHumbleEnum val : MyHumbleEnum.values()) {
            if (val == MyHumbleEnum.valueOf("КОНСТАНТА_1")) {
                System.out.println("Найдена первая константа");
            }
        }
    }
}
