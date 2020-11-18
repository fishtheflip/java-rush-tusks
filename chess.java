//задаём шахматную доску двумерным массивом
// Сопоставим каждой паре индексов двумерного массива их “шахматный” эквивалент.
// Для этого используем две строки — "abcdefgh" и "87654321" (в обратном порядке — для простоты, чтобы шахматная 8 соответствовала нулевому столбцу).    

String [][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }


       
public static String chessBoardCoord(int a, int b) {
            String letters = "abcdefgh";
            String numbers = "87654321";
            if ((a > 7)|| (b>7)) return null; //если номер за пределами доски, возвращаем значение по умолчанию - null
            else return (Character.toString(letters.charAt(a)) + numbers.charAt(b)); /*charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером, здесь - под номерами a и b. Character.toString - метод, который переводит полученный символ в строку*/
        }

        Теперь выведем в каждой ячейке не только её цвет, но также её номер, используя метод chessBoardCoord 

String [][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W" + chessBoardCoord(j,i);
                else chessBoard[i][j] = "B"+ chessBoardCoord(j,i);
            }
        }

            for (int i = 0; i < chessBoard.length; i++) {
                for (int j = 0; j < chessBoard[0].length; j++) {
                    System.out.print(" " + chessBoard[i][j] + " ");
                }
                System.out.println();
            }