/*Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
•	Саму строку "end" не нужно добавлять в список.
•	Выведи список на экран, каждое значение с новой строки.
•	Используй цикл for.
*/



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution1 {
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
