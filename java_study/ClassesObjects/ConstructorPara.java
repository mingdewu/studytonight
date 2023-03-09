package ClassesObjects;

public class ConstructorPara {
    int modelYear;
    String modelName;

    public ConstructorPara(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        ConstructorPara myCar = new ConstructorPara(1996, "march");
        System.out.println(myCar.modelYear + " and " + myCar.modelName);
    }
}
