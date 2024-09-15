import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Ms. Nahar :)");
    }
    public static int fibonacciRecursiveMemo(int n) {
        HashMap<Integer, Integer> foundValues= new HashMap<Integer, Integer>();
        if (n <= 1) {
            return n;
        }
        if (foundValues.containsKey(n)) {
            return foundValues.get(n);
        }
        else {
            int result = fibonacciRecursiveMemo(n - 1) + fibonacciRecursiveMemo(n - 2);
            foundValues.put(n, result);
            return result;
        }
    }
}