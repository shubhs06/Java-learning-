package CollectionsInJava;

public class ConCateVarArg {

    public static String string(String a,String b,   String... ele){
        StringBuilder sb = new StringBuilder();
        for (String goal : ele) {
            sb.append(goal + " ");
        }

        return a + " " + b +" " + sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(string("i","want", "to", "become","king"));
    }
}
