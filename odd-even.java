
/* 
Чётные и нечётные циферки
*/
/*Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1 */

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
            int num;
    while(true){
        if(i==0){
            break;
        }
        if(i%2==0){
            even++;
        } else {
            odd++;
    }
        i = i/10;
        if(i<1){
            break;
        }
    }
    System.out.print("Even: "+even+" ");
    System.out.print("Odd: "+odd);
}
}


