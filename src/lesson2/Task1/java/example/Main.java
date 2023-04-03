package example;

public class Main {

    public static void main(String[] args) {
        String c = buildString(5, 'a', 'b');

        System.out.println(c);
    }
        static String buildString( int n, char c1, char c2){
           StringBuilder sb = new StringBuilder();
           if (n % 2 > 0){
               for (int i = 0; i < n / 2; i++) {
                   sb.append(c1).append(c2);
               }
               sb.append(c1);
               String str = sb.toString();
               return str;
           } else {
               for (int i = 0; i < n / 2; i++) {
                   sb.append(c1).append(c2);
               }
               String str = sb.toString();
               return str;
           }
        }
    }

