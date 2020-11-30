
public class Example {
    public void example(){
        for(PredefinedColors color : PredefinedColors.values()){
            System.out.println(color);
        }

        PredefinedColors color = PredefinedColors.GREEN;
        color.method();
    }
}
