public class TypeCasting {
    class SuperClass {
        public void print() {
            System.out.println("Printing from SuperClass");
        }
    }

    class Child extends SuperClass {
        String name;

        Child(String s) {
            this.name = s;
        }

        @Override
        public void print() {
            System.out.println("Printing from Child class");
        }

        public void printName() {
            System.out.println(this.name);
        }
    }

    public static void main(String[] args) {
        Child c = new Child("child");
        c.print();

        // Implicit Upcasting
        SuperClass s2 = new Child("Second Child");
        s2.print();// print() method of Child class is called due to dynamic binding
    }
}
