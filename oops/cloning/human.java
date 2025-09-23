package oops.cloning;

public class human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7,8,9};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // this is shallow copy
//        // For primitive types (int, char, double, etc.), the actual value is copied.
//        // For object types (String, ArrayList, custom classes), the reference (memory address) is copied, not the object the reference points to.
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{

        human twin = (human)super.clone(); // this is still  a shallow copy

        // this is the deep copy
        twin.arr = new int[twin.arr.length];
        for(int i=0; i<twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
