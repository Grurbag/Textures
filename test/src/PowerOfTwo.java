public class PowerOfTwo {
    public static int smallestPowerOfTwo(int N) {
        if (N < 1) return 0; // Если N <= 0, 2^0 = 1 больше N
        return (int) Math.ceil(Math.log(N + 1) / Math.log(2));
    }

    public static void main(String[] args) {
        int N = 10;
        int result = smallestPowerOfTwo(N);
        System.out.println(result);  // Вывод: 4
    }
}