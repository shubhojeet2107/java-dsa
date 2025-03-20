package leetcode;

public class leetcode2594 {
        public long numberOfCars(int[] ranks, long bound) {
            long count = 0;
            for (int rank : ranks) {
                count += (long) Math.sqrt(bound / rank);
            }
            return count;
        }
    
        public long repairCars(int[] ranks, int cars) {
            long low = 0, high = 0;
            
            for (int rank : ranks) {
                high = Math.max(high, (long) rank);
            }
            
            high = high * cars * cars;
    
            while (low <= high) {
                long mid = low + (high - low) / 2;
    
                if (numberOfCars(ranks, mid) >= cars) {
                    high = mid - 1; // Try to minimize time
                } else {
                    low = mid + 1; // Increase time
                }
            }
    
            return low; // `low` contains the minimum time needed
        }
        
        public static void main(String[] args) {
            leetcode2594 sol = new leetcode2594();
            int[] ranks = {4, 2, 3, 1};
            int cars = 10;
            System.out.println(sol.repairCars(ranks, cars)); // Expected output: 16
        }
    }
    

