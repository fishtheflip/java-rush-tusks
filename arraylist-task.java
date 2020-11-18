// Ввести с клавиатуры 2 числа N и M.
// Ввести N строк и заполнить ими список.
// Переставить M первых строк в конец списка.
// Вывести список на экран, каждое значение с новой строки.

// Примечание: запрещено создавать больше одного списка.


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();

            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n  ; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < m; i++) {

            list.add(list.size() ,list.get(i));

        }
        list.subList(0, m ).clear();
        for (int i = 0; i <list.size()  ; i++) {
            System.out.println(list.get(i));

        }
    }
}


