/*Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
import static java.util.Collections.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       ArrayList<Integer> list = new ArrayList<>();
       list.add(a);
       list.add(b);
       list.add(c);
       sort(list);
       reverse(list);
       for (Integer name:list)
           System.out.print(name + " ");
    }
}
