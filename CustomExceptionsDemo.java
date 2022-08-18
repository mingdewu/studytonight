class IndexNotValidException extends Exception {
    IndexNotValidException(String msg)// Constructor with error message
    {
        super(msg);
    }
}

class MyArray {
    int[] array;

    MyArray(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = i * 5;
    }

    public int get(int index) throws IndexNotValidException {
        if (index >= array.length)
            throw new IndexNotValidException("Index" + index + "is invalid.");
        else
            return array[index];
    }
}

public class CustomExceptionsDemo {
    public static void main(String[] args) {
        MyArray arr = new MyArray(5);
        try {
            arr.get(10);
        } catch (IndexNotValidException e) {
            e.printStackTrace();
        }
    }
}