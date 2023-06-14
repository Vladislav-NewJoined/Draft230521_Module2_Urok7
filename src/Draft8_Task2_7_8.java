import java.util.Scanner;

public class Draft8_Task2_7_8 {
    public static void main(String[] args) {
        System.out.println("Задание : \n8.\tПользователь вводит предложение. Замените в каждом слове этого предложения, последн** д** бук** на **\n\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите предложение: ");
        String line = scanner.nextLine();

        int start = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (!(((ch > 'а') && (ch < 'я')) || ((ch > 'А') && (ch < 'Я')) || ch == '-')) {
                String word = line.substring(start, i);
                start = i + 1;   // далее видео с мин 38.40

            }
        }


    }
}
