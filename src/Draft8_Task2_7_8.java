import java.util.Scanner;

// Замена звездочками: видео мин 05.17
// Отдельно целую отдельно дробную часть из 3.13: видео мин 14.14
// Сохранить в массив первое слово предложение видео мин 22.21
// Аналогично последнее слово предложение видео мин 25.23
// Сохранить все слова из предложения: видео мин 34.07


public class Draft8_Task2_7_8 {

    //        Пример _ ППППППППППППППППППППППППППППППППППП


    public static void main(String[] args) {
        System.out.println("Задание : \n8.\tПользователь вводит предложение. Замените в каждом слове этого предложения, последн** д** бук** на **\n\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите предложение, например 'Коллега пьет кофе.': ");
        String line = scanner.nextLine();
        String [] words = new String[1000];
        int countOfWords = 0;

        int start = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (!(((ch >= 'а') && (ch <= 'я')) || ((ch >= 'А') && (ch <= 'Я')) || ch == '-')) {
                String word = line.substring(start, i); //
                words[countOfWords] = word;
                countOfWords++;
                start = i + 1;   // далее видео с мин 38.40

            }
        }

        for (int i=0; i<countOfWords; i++) {
            /*System.out.println(words[i]);*/
            String str = words[i];
            char[] chars = str.toCharArray();
            int size = chars.length;
            for (int n = 0; n<size - 2; n++) {
                System.out.print(chars[n]);
            }
            System.out.print("** ");
            // Заменить в самом массиве : видео мин 06.50
        }

    }

    //        Конец Примера _ КККККККККККККККК










//    //        Пример 2 ППППППППППППППППППППППППППППППППППП
//
//
//    public static void main(String[] args) {
//        System.out.println("Задание : \n8.\tПользователь вводит предложение. Замените в каждом слове этого предложения, последн** д** бук** на **\n\nРешение: ");
//        Scanner scanner = new Scanner (System.in);
//        System.out.print("Введите предложение: ");
//        String line = scanner.nextLine();
//        String [] words = new String[1000];
//        int countOfWords = 0;
//
//        int start = 0;
//        for (int i = 0; i < line.length(); i++) {
//            char ch = line.charAt(i);
//            if (!(((ch > 'а') && (ch < 'я')) || ((ch > 'А') && (ch < 'Я')) || ch == '-')) {
//                String word = line.substring(start, i); //
//                words[countOfWords] = word;
//                countOfWords++;
//                start = i + 1;   // далее видео с мин 38.40
//
//            }
//        }
//
//        for (int i=0; i<countOfWords; i++) {
//            /*System.out.println(words[i]);*/
//            String str = words[i];
//            char[] chars = str.toCharArray();
//            int size = chars.length;
//            for (int n = 0; n<size - 2; n++) {
//                System.out.print(chars[n]);
//            }
//            System.out.print("** ");
//            // Заменить в самом массиве : видео мин 06.50
//        }
//
//    }
//
//    //        Конец Примера 2 КККККККККККККККК











//    //        Пример 1 ППППППППППППППППППППППППППППППППППП
//
//
//    public static void main(String[] args) {
//        System.out.println("Задание : \n8.\tПользователь вводит предложение. Замените в каждом слове этого предложения, последн** д** бук** на **\n\nРешение: ");
//        Scanner scanner = new Scanner (System.in);
//        System.out.print("Введите предложение: ");
//        String line = scanner.nextLine();
//         String [] words = new String[1000];
//         int countOfWords = 0;
//
//        int start = 0;
//        for (int i = 0; i < line.length(); i++) {
//            char ch = line.charAt(i);
//            if (!(((ch > 'а') && (ch < 'я')) || ((ch > 'А') && (ch < 'Я')) || ch == '-')) {
//                String word = line.substring(start, i); //
//                words[countOfWords] = word;
//                countOfWords++;
//                start = i + 1;   // далее видео с мин 38.40
//
//            }
//        }
//
//        for (int i=0; i<countOfWords; i++) {
//            System.out.println(words[i]);
//        }
//
//    }
//
//    //        Конец Примера 1 КККККККККККККККК





}
