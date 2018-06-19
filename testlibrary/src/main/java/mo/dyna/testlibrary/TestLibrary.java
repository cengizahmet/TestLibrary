package mo.dyna.testlibrary;

public class TestLibrary {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int multiple(int a, int b){
        return a * b;
    }

    public static String returnResult(int a, int b){
        return "sum :" +sum(a,b) + "/" + "multiply" + multiple(a,b);
    }
}
