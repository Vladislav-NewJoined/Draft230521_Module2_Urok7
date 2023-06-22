import java.util.Scanner;

// взято отсюда: https://stackoverflow.com/questions/11810406/how-to-replace-replace-vowels-with-a-special-character-in-java


public class Draft8_Task2_7_6 {

    //        Пример _ ППППППППППППППППППППППППППППППППППП


    public static void main(String[] args) {
        System.out.println("Задание : \n6.\tЗамените все гласные в слове на ‘у'\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите слово на кириллице: ");
        String str = scanner.nextLine();

        String str2 = str.replaceAll( "[АУОЫИЭЯЮЁЕауоыиэяюёеAEIOUaeiou]", "у" );
        System.out.println(str2);

    }

    //        Конец Примера _ КККККККККККККККК





}
