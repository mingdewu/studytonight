import java.util.Scanner;

class ScannerDemotest {
    public static void main(String[] args) {
        System.out.println("请输入数字：（输入非数字来结束输入）");
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }
}