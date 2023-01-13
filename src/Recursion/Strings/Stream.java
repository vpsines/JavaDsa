package Recursion.Strings;

public class Stream
{
    public static void main(String[] args) {
        skip("","abadafag");
        System.out.println(skipReturn("ababab"));
        System.out.println(skipApple("vyshapplenav"));
        System.out.println(skipAppIfNotApple("bayapplemax"));
    }

    // return string without a
    static void skip(String p, String up){
        // base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        // store the first character
        char ch = up.charAt(0);

        // if its target character, no need to add it to processed string
        // else add
        // unprocessed string will be the string excluding first character
        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }

    }

    // return string without a
    static String skipReturn( String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
           return skipReturn(up.substring(1));
        }else{
           return ch + skipReturn(up.substring(1));
        }

    }

    // return string without "apple"
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    // return string without app if its not apple
    static String skipAppIfNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppIfNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppIfNotApple(up.substring(1));
        }
    }
}
