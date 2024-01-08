package method;

public class Overloading1 {
    public static void main(String[] args) {
        add(1, 2);
        add(1, 2, 3);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
