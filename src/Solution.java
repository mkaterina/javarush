import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<String>();

        for (int i = 0; i < str.size(); i++) {
            str.add(rd.readLine());
        }

        for (; ; ) {
            String s = rd.readLine();

            if (s.equals("end")) {
                break;
            } else {
                str.add(s);
            }
        }


        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));


        }
    }
}