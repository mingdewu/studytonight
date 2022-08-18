public class JsonToObj {
    public static void main(String[] args) {
        try {
            String jsonString = "[{\"field1\":\"Sample-1\",\"field2\":20.21}, {\"field1\":\"Sample-2\",\"field2\":22.55}]";
            // Reading into an object array
            ObjectMapper objMapper = new ObjectMapper();
            // Printing the objects
            for (DemoClass obj : objectArr)
                System.out.println(obj.getField1() + " " + obj.getField2());
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
