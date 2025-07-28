public class ArrayToString {
    public static void main(String[] args) {
        String[] str = new String[]{"Hello", "my", "name", "is", "Shubham."};
        StringBuilder sb = new StringBuilder();
        for (String string : str) {
            sb.append(string + " " );
        }
        System.out.println(sb.length());
        System.out.println(sb.reverse());
    }
}
