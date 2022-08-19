class GPA
{
    int firstYear;
    int secondYear;
    GPA(int fy,int sy)
    {
        this.firstYear = fy;
        this.secondYear = sy;
    }
    public int getFirstYear(){
        return firstYear;
    }
    public void setFirstYear(int firstYear){
        this.firstYear = firstYear;
    }
    public int getSecondYear(){
        return secondYear;
    }

    public void setSecondYear(int secondYear){
        this.secondYear=secondYear;
    }
}
class Student implements Cloneable{
    private String name;
    private GPA gpa;

    Student(String name,GPA gpa){
        this.name=name;
        this.gpa=gpa;
    }

    @Override 
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String getName()
    {
        return  this.name;
    }
    public GPA getGPA()
	{
		return this.gpa;
	}
	public void setName(String name)
	{
		this.name = name;
	}	
	public void setGPA(GPA g)
	{
		this.gpa = g;
	}
}
public class SwallowCopy{
    public static void main(String[] args) throws CloneNotSupportedException
	{
		GPA g = new GPA(7, 8);
		Student s = new Student("Justin", g);//original object
		
		Student copy = (Student)s.clone();//deep copy
		
		System.out.println("Original Object's GPA: " + s.getGPA().getFirstYear() + " " + s.getGPA().getSecondYear());
		System.out.println("Cloned Object's GPA: " + copy.getGPA().getFirstYear() + " " + copy.getGPA().getSecondYear());
		
		copy.getGPA().setFirstYear(10);//Changing the GPA field of the deep copy
		
		System.out.println("\nAfter changing the Deep copy");
		System.out.println("Original Object's GPA: " + s.getGPA().getFirstYear() + " " + s.getGPA().getSecondYear());
		System.out.println("Cloned Object's GPA: " + copy.getGPA().getFirstYear() + " " + copy.getGPA().getSecondYear());
		
	}
}