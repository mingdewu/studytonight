public class Penguin {
    private String name;
    private int id;
    public Penguin(String myName, int  myid) {
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}
public class Mouse {
    private String name;
    private int id;
    public Mouse(String myName, int  myid) {
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}


public class Animal{
    private String name;
    private int id;
    public Animal(String myName,int myid){
        name = myname;
        id= myid;
    }
    public void eat(){
        System.out.println(name+"eating");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}


public class Penguin extends Animal{
    public Penguin(String myName,int myid){
        super(myName,myid)
    }
}

public class Mouse extends Animal{
    public Mouse(String myName,int muid){
        super(myName,myid);
    }
}


