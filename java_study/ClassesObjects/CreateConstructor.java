package ClassesObjects;

public class CreateConstructor {
    int x;

    public CreateConstructor() {
        x = 5;
    }

    public static void main(String[] args) {
        CreateConstructor myObj = new CreateConstructor();
        System.out.println(myObj.x);
    }
}
