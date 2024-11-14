// num = 9
// num in binary = 1001; thus ans = 2;

public class countsetbits {
    public static void main(String[] args){
        // int num = 9;
        // int count = 0;
        // System.out.println(Integer.toBinaryString(num));

        // while (num > 0){
        //     if((num & 1) == 1){
        //         count++;
        //     } 
        //     num = num >> 1;
        // }
        // System.out.print(count);
        System.out.print(countSetBits(17));
    }

    public static int countSetBits(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            int n = i;
            while (n > 0){
                if((n & 1) == 1){
                    count++;
                } 
                n = n >> 1;
            }
        }
        return count; 
    }
}