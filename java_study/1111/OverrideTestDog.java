class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }
}
public class OverrideTestDog {
    publicstatic void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
    }
}
