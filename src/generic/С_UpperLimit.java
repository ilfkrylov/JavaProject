package generic;


public class С_UpperLimit<T extends Number> {
    public void example() {
        С_UpperLimit<Integer> ul1 = new С_UpperLimit<>();
        С_UpperLimit<Double> ul2 = new С_UpperLimit<>();
        // Ошибка
        // UpperLimit<String> ul3 = new UpperLimit<>();
    }

}
