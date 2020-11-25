package generic;


public class D_SimpleMetaSymbol {

    void setSomeValue(С_UpperLimit<?> val) {
    }

    void setSomeValueExtends(С_UpperLimit<? extends Number> val) {
    }

    void setSomeValueSuper(С_UpperLimit<? super Number> val) {
    }

    public void example() {
        С_UpperLimit<Integer> ul1 = new С_UpperLimit<>();
        С_UpperLimit<Double> ul2 = new С_UpperLimit<>();
        setSomeValue(ul1);
        setSomeValue(ul2);
    }
}
