import java.util.Base64;

public class Base64Demo {
    public static void main(String arg[]) {
        String strToEncode = "where are you?";
        // encoding
        byte[] bytesToEncode = strToEncode.getBytes();
        String encodedStr = Base64.getEncoder().encodeToString(bytesToEncode);
        System.out.println("Encoded String: " + encodedStr);
        // decoding
        byte[] decodedByteArr = Base64.getDecoder().decode(encodedStr);
        String decodedStr = new String(decodedByteArr);
        System.out.println("Decoded String: " + decodedStr);
    }
}
