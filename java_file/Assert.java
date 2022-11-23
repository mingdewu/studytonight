public class Assert {
    public static void main(String args[]) {
        int[] arrOfLengthTwo = { 2, 1, 1 };
        assert arrOfLengthTwo.length == 5 : "Array Length is Not 5";
        System.out.print("Array Length is:" + arrOfLengthTwo.length);
    }
}
