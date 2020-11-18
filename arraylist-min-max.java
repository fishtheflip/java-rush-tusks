    // Объяви переменную типа список строк и сразу проинициализируй ee.
    // Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
    // Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
    // Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
    // Должна быть выведена только одна строка.




public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
    Scanner in = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        int max = 0;
        
        for(int i = 0; i < 10; i++){
            String s = in.nextLine();
            strings.add(s);
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max)
                max = strings.get(i).length();
        }
         int min = strings.get(0).length();// присваеваем минимальное значение 1 элементу в списке
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < min )
                min = strings.get(i).length();
        }
        for(int i = 0; i < 10; i++){
            if(strings.get(i).length() == min){
                System.out.println(strings.get(i));
                break;
            } else if(strings.get(i).length() == max) {
                System.out.println(strings.get(i));
                break;
            }
        }

        Требования:

