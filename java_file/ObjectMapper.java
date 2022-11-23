import java.io.File;

public class ObjectMapper {
    public static void main(String[] args) {
        try {
            String filePath = "xxxx.json";
            File file = new File(filePath);
            ObjectMapper objMapper = new ObjectMapper();
            DemoClass obj = new DemoClass();
            obj = objMapper.readValue(file, DemoClass.class);
            System.out.print(obj.getField1() + " " + obj.getField2());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    class DemoClass {
        private String field1;
        private Double field2;

        // Constructors
        DemoClass() {
        }

        DemoClass(String field1, Double field2) {
            this.field1 = field1;
            this.field2 = field2;
        }

        // getters and setters
        public String getField1() {
            return field1;
        }

        public void setField1(String field1) {
            this.field1 = field1;
        }

        public Double getField2() {
            return field2;
        }

        public void setField2(Double field2) {
            this.field2 = field2;
        }
    }
}
