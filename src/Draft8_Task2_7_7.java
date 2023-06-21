import java.util.Scanner;

// вывод на печать целой и дробной части числа: сначала видео мин 13.42 потом видео мин 21.13

public class Draft8_Task2_7_7 {

    //        Пример _ ППППППППППППППППППППППППППППППППППП

    public static void main(String[] args) {
        System.out.println("Задание : \n7.\tПользователь вводит дробное число, выведите его дробную часть\n\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите дробное число с разделителем 'точка': ");
        String num = scanner.nextLine();
        /*char [] nums = num.toCharArray();*/
        int dotIndex = 0;
        int i = 0;
        while (i<num.length() && dotIndex == 0) {
            if (num.charAt(i) == '.') {
                dotIndex = i;
            }
            i++;
        }
        /*System.out.println(dotIndex);*/
        char [] fractPart = new char[num.length() - dotIndex -1];
        int fractIndex =0;
        for (int x = dotIndex+1; x<num.length(); x++) {
            fractPart [fractIndex] = num.charAt(x);
            fractIndex++;
        }
        System.out.println(fractPart);


    }

    //        Конец Примера _ КККККККККККККККК







}
