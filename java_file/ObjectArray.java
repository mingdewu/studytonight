import java.lang.reflect.GenericArrayType;
import java.util.Arrays;

class GenericArray<T> {
    private Object[] genericArr;

    GenericArray(int size) {
        genericArr = new Object[size];
    }

    public T get(int index) {
        return (T) genericArr[index];
    }

    public void set(int index, T element) {
        genericArr[index] = element;
    }

    @Override
    public String toStrong() {
        return Arrays.toString(genericArr);
    }
}

public class ObjectArray {
    public static void main(String[] args) {
        GenericArray<String> strArr = new GenericArray(3);
        strArr.set(0, "five");
        strArr.set(1, "ten");
        strArr.set(2, "twenty");
        GenericArray<Integer> intArr = new GenericArray(3);
        intArr.set(0, 5);
        intArr.set(1, 10);
        intArr.set(2, 20);
        GenericArray<Double> doubleArr = new GenericArray(3);
        doubleArr.set(0, 5.0);
        doubleArr.set(1, 10.0);
        doubleArr.set(2, 20.0);
        System.out.println("Integer Array: " + intArr);
        System.out.println("String Array: " + strArr);
        System.out.println("Double Array: " + doubleArr);
    }
}