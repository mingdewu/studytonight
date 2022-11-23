import java.net.URL;

public class ReadingFromUrl {
    public static void main(String[] args) {
        try {
            ObjectMapper objMapper = new ObjectMapper();
            URL jsonFileUrl = new URL("xxxx.json");
            DemoClass obj = new DemoClass();
            obj = objmapper.readValue(jsonFileUrl, DemoClass.class);
            System.out.print(obj.getField1() + " " + obj.getField2());
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
