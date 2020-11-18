// Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
// Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
// Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
// Порядок объявления списков очень важен.
// 2. Метод printList должен выводить на экран все элементы списка с новой строки.
// 3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
    
        
        for(int i = 0; i < 20; i++){
            int s = in.nextInt();
            list1.add(s);
            if(list1.get(i) % 3 == 0){
                list2.add(list1.get(i));
            }
            if(list1.get(i) % 2 == 0){
                list3.add(list1.get(i));
            } if(list1.get(i) % 3 != 0 && list1.get(i) % 2 != 0) {
                list4.add(list1.get(i));
            }
           
        }
        
        printList(list2);
        printList(list3);
        printList(list4);
    
        
    
        
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

