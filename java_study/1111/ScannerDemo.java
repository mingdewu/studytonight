import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("next方式接收：");
        if(scan.hasNext()){
            String str1 = scan.next();
            System.out.print("it is"+str1);
        }
        scan.close();
    }
}
