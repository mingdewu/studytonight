import java.io.File;

public class JsonFromObjects {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass("Sample-1", 20.21);
        try {
            String filePath = "C:\\Users\\Lenovo\\Desktop\\jsonDemo.json";
            File file = new File(filePath);

            ObjectMapper objMapper = new ObjectMapper();
            objMapper.writeValue(file, obj);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
