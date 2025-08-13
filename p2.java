package oppp;

public class p2 {
	public static void main(String[] args) {
        double d = 123.456;
        float f = (float) d;     // double -> float
        long l = (long) f;       // float -> long
        int i = (int) l;         // long -> int
        short s = (short) i;     // int -> short
        byte b = (byte) s;       // short -> byte
        int num = 65;
        char ch = (char) num;    // int -> char

        System.out.println("byte: " + b);
        System.out.println("int to char: " + ch);   // A
    }
}
