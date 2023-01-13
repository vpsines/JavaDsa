package LinearSearch;

public class SearchString {

    public static void main(String[] args) {
      System.out.println(searchChar("fly high",'h'));
    }

    static boolean searchChar(String str, char target){
        if(str.length() == 0){
            return  false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return  true;
            }
        }
        return  false;
    }
}
