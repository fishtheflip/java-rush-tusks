/*Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
list.add(a);
list.add(b);
list.add(c);
list.add(d);
int max = list.get(0);
for (Integer maxy : list) {
          if (maxy > max) {
                          max = maxy;
                }
}
System.out.println(max);
    }
}
