package methoddemo;

public class Method_param {
    static void myMethod(String fname) {
        System.out.println("Hello good bye" + fname + "Refsnes");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
