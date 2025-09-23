package oops.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        human shubhojeet = new human(21, "shubhojeet");
//        human twin = new human(shubhojeet);

        human twin = (human)shubhojeet.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(shubhojeet.arr));
    }
}
