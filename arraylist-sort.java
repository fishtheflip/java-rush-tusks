// 1. Создай список строк.
// 2. Считай с клавиатуры 5 строк и добавь в список.
// 3. Используя цикл, найди самую длинную строку в списке.
// 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int max =0;
        for(int i = 0; i <5; i ++){
            String s = in.nextLine();
            strings.add(s);
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max)
                max = strings.get(i).length();
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max)
                System.out.println(strings.get(i));
        }
        
            
        
    }
}

