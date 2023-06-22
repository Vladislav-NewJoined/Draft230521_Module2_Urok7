import java.util.Scanner;

// Отдельно целую отдельно дробную часть из 3.13: видео мин 14.14
// Сохранить в массив первое слово предложение видео мин 22.21
// Аналогично последнее слово предложение видео мин 25.23
// Сохранить все слова из предложения: видео мин 34.07


public class Draft8_Task2_7_1 {

    //        Пример _ ППППППППППППППППППППППППППППППППППП


    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tПользователь вводит пять строк. Выведите слово, состоящие из первой буквы каждой строки.\n\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите пять строк/слов через пробел, например 'Иван идёт пить кофе': ");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();

        System.out.print(chars[0]);

        for (int i=1; i<chars.length; i++) {
            if (chars[i] == ' ') {
                System.out.print(chars[i+1]);
            }
        }
    }

    //        Конец Примера _ КККККККККККККККК
}
