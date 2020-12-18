import java.util.ArrayList;

public class DecimalZipMain {
       public static int a = 1234;
       public static int b = 56;
       public static void main(String[] args) {
              System.out.println(DecimalZip.calcoloDecimalZip(a, b));
       }
}

class DecimalZip {
       static int calcoloDecimalZip(int a, int b) {
              String c = Integer.toString(a);
              String d = Integer.toString(b);
              String e = "";
              int maxValue = 100000000;
              ArrayList<String> array = new ArrayList<String>();
              for (int i = 0; i < c.length() || i < d.length(); i++) {
                     if (i < c.length()) {
                            array.add(Character.toString(c.charAt(i)));
                     }
                     if (i < d.length()) {
                            array.add(Character.toString(d.charAt(i)));
                     }
              }
              for (int i = 0; i < array.size(); i++) {
                     e += array.get(i);
              }
              if (Integer.parseInt(e) > maxValue) {
                     return -1;
              } else {
                     return Integer.parseInt(e);
              }
       }
}
