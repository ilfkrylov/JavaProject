package directory.syntax;

public class AreasForVariables {

    // Статические переменные класса существуют всё время работы программы.
    // Их видимость дополнительно регулируется модификаторами доступа.
    static long staticInClass = 10L;

    // Переменные объекта (экземпляра) существуют всё время жизни содержащего их объекта.
    // Их видимость дополнительно регулируется модификаторами доступа.
    int inClass = 5;

    // Переменные (аргументы метода) существуют везде внутри метода
    public void example(String[] args) {

        // Переменная, объявленная в методе, существует (видна)
        // с начала объявления и до конца метода
        int inMethod = 4;

        if (inMethod > 3) {
            // Переменная, объявленная в блоке кода,
            // существует до конца этого блока кода.
            int inBlock = 4;
            System.out.println(inBlock);
        }

        for (int i = 0; i < 5; ++i) {
            // Переменная, объявленная в блоке кода,
            // существует до конца этого блока кода.
            System.out.println(i);
        }

        System.out.println(inMethod);

        System.out.println(args);

        System.out.println(inClass);

        System.out.println(staticInClass);
    }

}


