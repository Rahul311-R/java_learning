//public class asciiForAll {
//    public static void main(String[] args) {
//        for(char ch='0';ch<='9';ch++){
//            int A = (int)ch;
//            System.out.println(ch+" "+A);
//        }
//    }
//}
public class asciiForAll {
    public static void main(String[] args) {
        for (char ch = 48; ch <= 122; ch++) {
            int asciiValue = (char) ch;

            System.out.println("ASCII value of " + ch +
                    " is: " + asciiValue);
        }
    }
}
