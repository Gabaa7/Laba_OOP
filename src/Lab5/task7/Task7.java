package Lab5.task7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static String[] elements = {"🍒", "🍋", "🍊", "🏆", "⚓"};

    public static void main(String[] args) {
        // 1. Створіть об'єкт Scanner для зчитування введених користувачем даних.
        Scanner scanner = new Scanner(System.in);

        // 2. Оголосіть змінні для збереження балансу, ставки, виграшу та рядка символів.
        int balance = 100;
        int bid;
        int win;
        String game;

        // 3. Виведіть вітальне повідомлення та список можливих символів.
        System.out.println("Вітаємо, ви попали в гру 'Слот машина' хай щастить!");
        System.out.println("В грі може бути такі символи:" + Arrays.toString(elements));
        // 4. Запустіть цикл гри, доки баланс більше нуля:
        do {
            // - Виведіть поточний баланс.
            System.out.println("Поточний баланс: " + "$" + balance);
            if (balance == 0) {
                System.out.println("Ви депнули квартиру, у вас більше немає грошей!");
                return;
            }
            // - Запитайте у користувача розмір ставки.
            System.out.print("Яку ставку зробимо?: ");
            bid = scanner.nextInt();
            scanner.nextLine();
            // - Перевірте коректність введеної ставки (не більше балансу, понад 0).
            if (bid <= 0 || balance < bid) {
                System.out.println("Введено невірну ставку, спробуйте ще раз!");
            }
            // - Відніміть ставку з балансу.
            balance -= bid;
            // - Запустіть обертання барабанів.
            String[] result = spinRow();
            // - Виведіть результат обертання.
            printRow(result);
            // - Обчисліть можливий виграш.
            win = getPayout(result, bid);
            // - Додайте виграш до балансу, якщо він є.
            balance += win;
            if (win > 0) {
                System.out.println("Ви вийграли " + win);
            } else {
                System.out.println("Ви програли " + bid);
            }
            System.out.println("Ваш баланс:" + balance);
            // - Запитайте у користувача, чи хоче він продовжити гру.
            System.out.println("Ви хочете грати ще (yes/no)?");
            game = scanner.nextLine();
        } while (game.equals("yes"));
        // 5. Виведіть фінальне повідомлення про завершення гри.
        System.out.println("Гра завершена, повертайтесь ще!");


    }

    /**
     * Метод spinRow() - генерує випадковий рядок із трьох символів для слота.
     *
     * @return Масив рядків із трьома випадковими символами.
     */
    static String[] spinRow() {
        Random random = new Random();
        // 1. Оголосіть масив можливих символів.
        // Глобальна змінна elements
        // 2. Створіть новий масив для результату.
        String[] randomElements = new String[3];
        // 3. Використовуючи генератор випадкових чисел, виберіть три випадкові символи.
        for (int i = 0; i < 3; i++) {
            randomElements[i] = elements[random.nextInt(elements.length - 1)];
        }
        // 4. Поверніть масив з згенерованими символами.
        return randomElements;
    }

    /**
     * Метод printRow() - виводить рядок символів у відформатованому вигляді.
     *
     * @param row Масив рядків, що містить три символи.
     */
    static void printRow(String[] row) {
        // 1. Виведіть рамку оформлення.
        System.out.println("*************");
        // 2. Виведіть рядок символів через роздільник " | ".
        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i]);
            if (i != row.length - 1) {
                System.out.print(" | ");
            }
        }
        // 3. Виведіть нижню частину рамки.
        System.out.println();
        System.out.println("*************");
    }

    /**
     * Метод getPayout() - обчислює виграш залежно від комбінації символів.
     *
     * @param row Масив рядків, що містить три символи.
     * @param bet Розмір ставки користувача.
     * @return Сума виграшу (або 0, якщо немає збігу).
     */
    static int getPayout(String[] row, int bet) {
        // 1. Перевірте, чи всі три символи однакові:
        boolean isMatch = true;
        for (int i = 0; i < row.length - 1; i++) {
            if (!row[i].equals(row[i + 1])) {
                isMatch = false;
                break;
            }
        }
        // - Якщо так, поверніть виграш за відповідний символ (із множником).
        if (isMatch) {
            switch (row[0]) {
                case "🍒":
                    return bet * 3;
                case "🍋":
                    return bet * 4;
                case "🍊":
                    return bet * 5;
                case "🏆":
                    return bet * 10;
                case "⚓":
                    return bet * 100;
                default:
                    return 0;
            }
        }
        // 2. Перевірте, чи два із трьох символів збігаються:
        boolean isMatch2 = false;
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = i + 1; j < row.length; j++) {
                if (row[i].equals(row[j])) {
                    isMatch2 = true;
                    break;
                }
            }
        }
        // - Якщо так, поверніть менший виграш за відповідний символ.
        if (isMatch2) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🏆" -> bet * 5;
                case "⚓" -> bet * 6;
                default -> 0;
            };
        }
        // 3. Якщо збігів немає, поверніть 0.
        return 0;
    }

}