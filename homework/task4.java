package homework;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String inputData = null;
        while (!valid) {
            System.out.print("Введите длинну текста > 0: \t");
            try {
                inputData = scanner.nextLine();
                if (inputData.length() > 0) {
                    valid = true;
                } else {
                    System.out.println("Неверный ввод!");
                    valid = false;
                }
            } catch (Exception ex) {
                valid = false;
            }
        }
        System.out.println("Вы ввели: " + inputData);
    }
}
