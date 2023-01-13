package StringOperations;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {
        System.out.println('a'+'b');  // ASCII value
        System.out.println("a"+"b");  // string
        System.out.println('a' + 3);  // ASCII value

        System.out.println("as"+3); // string
        // integer will be converted to Integer that will call toString()

        System.out.println("Am i" + new ArrayList<>());
        // atleast one of the operand should be string for concatenation to work
    }
}
