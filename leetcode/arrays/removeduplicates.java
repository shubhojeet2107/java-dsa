package leetcode.arrays;

import java.util.Scanner;
import java.util.ArrayList;
public class removeduplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i=0; i<size; i++){
            System.out.print("Number " +(i+1)+": ");
            list.add(sc.nextInt());
        }
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(j).equals((list.get(i)))){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.print(list);
        sc.close();
        }
    }
