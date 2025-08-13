package oppp;

public class logicalOperations {
	public static void main(String[] args) {
        int a = 10, b = 5, c = 20;
        System.out.println((a > b) && (a < c));   // true
        System.out.println((a < b) || (a < c));   // true
        System.out.println(!(a < c));             // false
    }
}
