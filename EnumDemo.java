public class EnumDemo {
    public static void main(String[] args) {
        StudentResult result = StudentResult.PASS;

        if (result == StudentResult.ABSENT)
            System.out.println("The student was absent for the exam.");

        else if (result == StudentResult.PASS)
            System.out.println("The student passed the exam.");

        else if (result == StudentResult.FAIL)
            System.out.println("The student failed the exam.");
    }

    public enum StudentResult {
        PASS,
        FAIL,
        ABSENT;
    }
}
