package recursion.strings;

public class basics {
    public static void main(String[] args){
        String str = "abbapplecd";
        skip("", str);
        System.out.println();
        System.out.println(skipString(str));
    }

    // function where in the empty string is also passed with the parameters.
    static void skip(String empty, String str){
        if(str.isEmpty()){
            System.out.print(empty);
            return;
        }

        char ch = str.charAt(0);
        if(ch == 'a'){
            skip(empty, str.substring(1));
        }else{
            skip(empty+ch, str.substring(1));
        }
    }

    // function where in, only the String str is passed in the parameters.
    public static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            return skip(str.substring(1));
        }else{
            return ch + skip(str.substring(1));
        }
    } 

    // function to skip a string.
    public static String skipString(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            return skipString(str.substring(5));  // "APPLE" has 5 characters. 
        }else{
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
}
