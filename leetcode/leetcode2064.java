package leetcode;

public class leetcode2064 {
    public static void main(String[] args){
        int[] quantities = {11,6};
        int ans = minimizedMaximum(6, quantities);
        System.out.println(ans);
    }

    public static int minimizedMaximum(int n, int[] quantities) {
        if(n == 1){
            return quantities[0];
        }

        int start = 1;
        int end = 0;

        for(int i=0; i<quantities.length; i++){
            end = Math.max(end, quantities[i]);
        }

        while(start < end){
            int mid = start+(end-start)/2;
            if(binarySearch(n, quantities, mid)){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    static boolean binarySearch(int n, int[] quantities, int allocation){
        int store = 0;
        for(int i=0; i<quantities.length; i++){
            store += (quantities[i] + allocation -1) / allocation;
        }

        if(store <= n){
            return true;
        }else{
            return false;
        }
    }
}



/*
🤔 Why Use the Ceil Formula?
We use the formula:


requiredStores += (quantities[i] + maxItems - 1) / maxItems;


Because for each product type, we want to know:
How many stores are needed to distribute quantities[i] products with at most maxItems per store?

This is greedy because:
You try to fill up each store with as many as possible, up to maxItems.
The fewer stores needed, the better.
If total stores required ≤ n, then this value of maxItems is feasible.
 */