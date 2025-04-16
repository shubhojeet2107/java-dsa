package oops.polymorphism;


// An example of function overloading.
public class Numbers {
    
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        Numbers obj = new Numbers();

        System.out.println(obj.sum(2, 5));

        System.out.println(obj.sum(2, 5, 15));
    }
}
