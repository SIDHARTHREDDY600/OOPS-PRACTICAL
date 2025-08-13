package oppp;

public class p1 {
	public static void main(String[] args) {
        byte b = 10;
        short s = b;       // byte -> short
        int i = s;         // short -> int
        long l = i;        // int -> long
        float f = l;       // long -> float
        double d = f;      // float -> double
        char ch = 'A';
        int num = ch;      // char -> int

        System.out.println("double: " + d);
        System.out.println("char to int: " + num); // 104
	}
}