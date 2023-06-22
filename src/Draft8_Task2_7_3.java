import java.util.Scanner;

public class Draft8_Task2_7_3 {


    //        Пример _ ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) {
        System.out.println("Задание : \n3.\tНайдите первую гласную букву в слове\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово на кириллице или на латинице: ");
        String word = scanner.nextLine();



        /*String word = "CRUZ";*/
        String vawel = "АУОЫИЭЯЮЁЕауоыиэяюёеAEIOUaeiou";
        int counter = 0;
        int i = 0;

        while (i < word.length() && counter == 0) {
                char ch = word.charAt(i);

                if (vawel.contains(String.valueOf(ch))) {
                    System.out.println("Первая гласная: " + String.valueOf(ch));
                    counter++;
                }

                i++;


        }




    }
    //        Конец Примера _ КККККККККККККККК









//    //        Пример 4 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n3.\tНайдите первую гласную букву в слове\n\nРешение: ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице: ");
//        String word = scanner.nextLine();
//
//
//
//        /*String word = "CRUZ";*/
//        String vawel = "АУОЫИЭЯЮЁЕауоыиэяюёеAEIOUaeiou";
//        int counter = 0;
//
//        while (counter == 0) {
//            for (int i = 0; i < word.length(); i++) {
//                char ch = word.charAt(i);
//
//                if (vawel.contains(String.valueOf(ch))) {
//                    System.out.println(String.valueOf(ch));    //add to your variable
//                    counter++;
//                }
//
//            }
//
//        }
//
//
//
//
//    }
//    //        Конец Примера 4 КККККККККККККККК





//
//    //        Пример 3 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n3.\tНайдите первую гласную букву в слове\n\nРешение: ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице: ");
//        String word = scanner.nextLine();
//        char[] vowels = {'a','e','o','i','u','y'};
//        for (int i=0; i < word.length(); i++){
//            for (int j=0; j < vowels.length(); j++) {
//                if (word.charAt(i) == vowels[j]){
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//    //        Конец Примера 3 КККККККККККККККК






//    //        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n3.\tНайдите первую гласную букву в слове\n\nРешение: ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице: ");
//        String word = scanner.nextLine();
//        char [] charsw = word.toCharArray();
//
//        String vowels = "АУОЫИЭЯЮЁЕауоыиэяюёеAEIOUaeiou";
//        int vowIndex = 0;
//
//        int index = 0;
//        while (index < word.length() && vowIndex == 0) {
//            if (vowels.contains(String.valueOf(word.charAt(index)))) {
//                /*index = index + 1;*/
//            }
//            index++;
//            vowIndex = vowIndex +1;
//            /*System.out.println(word.charAt(index));*/
//        }
//
//        System.out.println(word.charAt(index));
//
//    }
//    //        Конец Примера 2 КККККККККККККККК






//        //        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n3.\tНайдите первую гласную букву в слове\n\nРешение: ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице: ");
//        String word = scanner.nextLine();
//        /*char [] charsw = word.toCharArray();*/
//
//        int vowIndex = 0;
//
//        String vowels = "АУОЫИЭЯЮЁЕауоыиэяюёеAEIOUaeiou";
//        /*char [] charsv = vowels.toCharArray();*/
//
//        int i = 0;
//
//
//        while (i < word.length() && vowIndex == 0) {
//            if (vowels.contains(word.charAt(i))) {  // найдена гласная
//                vowIndex++;
//            }
//
//        }
//        System.out.println("Первая гласная: " + vowIndex);
//
//    }
//    //        Конец Примера 1 КККККККККККККККК







}