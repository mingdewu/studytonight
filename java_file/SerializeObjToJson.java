public class SerializeObjToJson {

    public static void main(String[] args) {
        DemoClass obj = new DemoClass("Sample-1", 20.21);// object to write
        try {
            ObjectMapper objMapper = new ObjectMapper();
            String jsonString = objMapper.writeValueAsString(obj);// Generating JSON as a String
            System.out.print(jsonString);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
