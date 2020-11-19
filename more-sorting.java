
/* 
Числа по возрастанию
*/


// Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

// Пример ввода:
// 3
// 2
// 15
// 6
// 17

// Пример вывода:
// 2
// 3
// 6
// 15
// 17

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int[] array = new int[5];
        for (int x = 0; x < array.length; x++) {
            array[x] = Integer.parseInt(reader.readLine());
        }
         for (int i = 0; i < array.length; i++) {
        int min = array[i];
        int minId = i;
        for (int j = i+1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                minId = j;
            }
        }
        // замена
        int temp = array[i];
        array[i] = min;
        array[minId] = temp;
    }
        for(int f = 0; f < array.length; f++){
            System.out.println(array[f]);
        }
        
}
}

