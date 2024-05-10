import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива через пробел:");
        String input = scanner.nextLine();
        String[] originalArray = input.split(" ");

        String[] newArray = filterShortStrings(originalArray);

        System.out.println("Новый массив строк:");
        for (String str : newArray) {
            System.out.print(str + " ");
        }
    }

    public static String[] filterShortStrings(String[] array) {
        int count = 0;
        // Определяем количество строк длиной не более 3 символов
        for (String str : array) {
            if (str.length() <= 3) {
                count++;
            }
        }

        // Создаем новый массив нужного размера
        String[] resultArray = new String[count];

        // Заполняем новый массив строками длиной не более 3 символов
        int index = 0;
        for (String str : array) {
            if (str.length() <= 3) {
                resultArray[index] = str;
                index++;
            } else {
                throw new RuntimeException("Пожалуйста введите корректную информацию");
            }
        }

        return resultArray;
    }

}