package inheritance;

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

public class InheritExtends extends Vehicle {
    private String modelName = "fararri";

    public static void main(String[] args) {
        InheritExtends myFastCar = new InheritExtends();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " and " + myFastCar.modelName);
    }
}
