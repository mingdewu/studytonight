package methoddemo;

public class Method_param_multi {
    static void myMethod(String fname, int age) {
        System.out.println(fname + "is" + age);
    }

    public static void main(String[] args) {
        myMethod("Anja", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}
