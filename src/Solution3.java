/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.

Требования:
Программа должна выводить текст на экран.
Программа должна считывать значения с клавиатуры.
Класс Solution должен содержать только три метода.
Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
Метод getMinimum() должен вернуть минимальное число среди элементов списка.
Метод main() должен вызывать метод getIntegerList().
Метод main() должен вызывать метод getMinimum().
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution3 {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
        // Найти минимум тут

    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<Integer>();
        int a = Integer.parseInt(rd.readLine());
        for (int i=0; i<a;i++) {
           list.add(Integer.parseInt(rd.readLine()));
        }
        // Создать и заполнить список тут
        return list;
    }
}
