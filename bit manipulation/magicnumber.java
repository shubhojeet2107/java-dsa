// question asked in Amazon.
// To find the Magic number.

//  1st Magic number is = 0(5 to the power 3) + 0(5 to the power 2) + 1(5 to the power 1) => 5
//  2nd Magic number is = 0(5 to the power 3) + 1(5 to the power 2) + 0(5 to the power 1) => 25
//  3rd Magic number is = 0(5 to the power 3) + 1(5 to the power 2) + 1(5 to the power 1) => 30

public class magicnumber {
    public static void main(String[] args){

        // Initialising the number as the Nth term for Magic number.
        int num = 5;
        int ans = 0;
        int power = 5;

        while (num > 0){
            int last = num & 1; //converting the number to binary and taking the last bit.
            num = num >> 1; //right shift the binary number by 1.
            ans += last*power; //updating the answer by taking the last bit and multiplying it with power(5).
            power *= 5; 
        }
        System.out.println(ans);
    }
}
