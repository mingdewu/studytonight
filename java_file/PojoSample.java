import java.io.Serializable;

public class PojoSample implements Serializable {
    public String field1;
    private int field2;
    double field3;

    // A default no-argument constructor must be present
    PojoSample() {
    }

    PojoSample(String s, int i, double d) {
        this.field1 = s;
        this.field2 = i;
        this.field3 = d;
    }

    public String getField1() {
        return this.field1;
    }

    public double getField3() {
        return this.field3;
    }

    public static void main(String[] args) {
        PojoSample s = new PojoSample("f1", 0, 0.0);
        try {
            Map<String, Object> properties = BeanUtils.describe(s);
            for (Map.Entry<String, Object> e : properties.entrySet())
                System.out.println(e.getKey() + "->" + e.getValue());
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}