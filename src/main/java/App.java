import seven.OptionalTest;

public class App {




    public static void main(String[] args) {
        App.testeIfNull();
    }

    public static void testeIfNull() {
        String value1 = "oi";
        String value2 = "tudo";
        String value3 = "bem?";
        String value4 = null;

        seven.OptionalTest test7 = new seven.OptionalTest();
        test7.caseJava7();

        System.out.println();
        eight.OptionalTest test8 = new eight.OptionalTest();
        test8.caseJava8();

    }
}
