public class FindSingle {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        int result = 0;

        // We loop over each bit position from 0 to 31 (assuming 32-bit integers).
        for (int i = 0; i < 32; i++) {
            int bitSum = 0;
            for (int j = 0; j < arr.length; j++) {
                // For each bit position, we count how many elements have that bit set.
                if ((arr[j] & (1 << i)) != 0) {
                    bitSum++;
                }
            }
            // If the count at a bit position is not a multiple of 3, we add that bit to our result using result |= (1 << i);.
            if (bitSum % 3 != 0) {
                result |= (1 << i);
            }
        }

        System.out.println("The element that appears only once is: " + result);
    }
}
