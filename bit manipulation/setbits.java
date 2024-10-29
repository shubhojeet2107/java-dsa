// num = 9
// num in binary = 1001; thus ans = 2;

public class setbits {
    public static void main(String[] args){
        int num = 9;
        int count = 0;
        System.out.println(Integer.toBinaryString(num));
        
        while (num > 0){
            if((num & 1) == 1){
                count++;
            } 
            num = num >> 1;
        }
        // System.out.println(Integer.toBinaryString(num));
        System.out.print(count);
    }
}
