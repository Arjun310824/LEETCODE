public class Solution {
    public static int smallestNumber(int n, int t) {
        for (int x = n; ; x++) {
            int product = digitProduct(x);
            if (product % t == 0) {
                return x;
            }
        }
    }

    private static int digitProduct(int num) {
        int product = 1;
        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber(15, 12)); // Example
    }
}
