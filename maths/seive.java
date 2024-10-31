// Time Complexity = o(n * log(log n))

package maths;

public class seive {
    public static void main(String[] args) {
        int num = 40;
        boolean[] prime = new boolean[num + 1];
        isPrime(num, prime);
    }

    public static void isPrime(int num, boolean[] prime) {

        for (int i = 2; i * i <= num; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= num; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
