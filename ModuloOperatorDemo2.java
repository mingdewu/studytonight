public class ModuloOperatorDemo2 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int remainder = dividend - (divisor * (dividend / divisor));
        System.out.println("The remainder is " + remainder);
    }
}