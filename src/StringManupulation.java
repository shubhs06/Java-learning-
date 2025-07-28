public class StringManupulation {
    public static void main(String[] args) {
        ConcatAndUpper();
    }
   static void ConcatAndUpper(){
        String firstName = "Shubham";
        String lastName = "Acharekar";
        String mystring = firstName.concat(" ").concat(lastName);
        System.out.println(mystring.toUpperCase());
        System.out.println(mystring.toLowerCase());
        System.out.println(mystring.toCharArray());
    }
}
