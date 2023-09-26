package homework;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean valid;
        Float myNumber = null;
        String inputData;
        do {
            System.out.print("Введите число: \t");
            try {
                inputData = scanner.nextLine();
                if (Float.parseFloat(inputData) > 0) {
                    myNumber = Float.parseFloat(inputData);
                    valid = true;
                } else {
                    System.out.println("Неверный ввод!");
                    valid = false;
                }
            } catch (Exception ex) {
                valid = false;
            }
        } while (!valid);
        System.out.println("Вы ввели: " + myNumber);
    }
}