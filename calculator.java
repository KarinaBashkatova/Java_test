import java.util.Objects;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class calculator {


    public static void main(String[] args) {
        System.out.print("Введите ваш пример");
        Scanner scanner = new Scanner(System.in);
        String example;
        example = scanner.nextLine();
        String[] parts = example.split(" ");
        String part1 = parts[0];
        String part2 = parts[2];
        String operator = parts[1];

        if (parts.length >= 4) {
                    throw new ArrayIndexOutOfBoundsException("Некорректный ввод");
                }

        if ((Objects.equals(part1, "I") || Objects.equals(part1, "II") || Objects.equals(part1, "III") || Objects.equals(part1, "IV") || Objects.equals(part1, "V") || Objects.equals(part1, "VI") || Objects.equals(part1, "VII") || Objects.equals(part1, "VIII") || Objects.equals(part1, "IX") || Objects.equals(part1, "X")) && (Objects.equals(part2, "I") || Objects.equals(part2, "II") || Objects.equals(part2, "III") || Objects.equals(part2, "IV") || Objects.equals(part2, "V") || Objects.equals(part2, "VI") || Objects.equals(part2, "VII") || Objects.equals(part2, "VIII") || Objects.equals(part2, "IX") || Objects.equals(part2, "X"))) {
            RomanNumbers x = RomanNumbers.valueOf(part1);
            RomanNumbers y = RomanNumbers.valueOf(part2);
            int result1;
            int x1 = Integer.parseInt(valueOf(x.getTransaction()));
            int y1 = Integer.parseInt(valueOf(y.getTransaction()));

            switch (operator) {
                case "+" -> {
                    result1 = x1 + y1;
                    String arabic = valueOf(result1);
                    RomanNumbers roman = RomanNumbers.getRomanByArabic(arabic);
                    System.out.println(roman);
                }
                case "-" -> {
                    result1 = x1 - y1;
                    String arabic = valueOf(result1);
                    RomanNumbers roman = RomanNumbers.getRomanByArabic(arabic);
                    System.out.println(roman);
                }
                case "*" -> {
                    result1 = x1 * y1;
                    String arabic = valueOf(result1);
                    RomanNumbers roman = RomanNumbers.getRomanByArabic(arabic);
                    System.out.println(roman);
                }
                case "/" -> {
                    result1 = x1 / y1;
                    String arabic = valueOf(result1);
                    RomanNumbers roman = RomanNumbers.getRomanByArabic(arabic);
                    System.out.println(roman);
                }
                default ->
                    throw new IndexOutOfBoundsException ("Некорректный оператор");
            }
            } else {


                try {
                    Integer.parseInt(part1);
                    Integer.parseInt(part2);
                } catch (NumberFormatException e) {throw new NumberFormatException("Используйте только арабские или только римские числа");}

            int part11 = Integer.parseInt(part1);
            int part22 = Integer.parseInt(part2);
            int result;

                if ((part11 > 0 && part11 <= 10) && (part22 > 0 && part22 <= 10)) {
                    switch (operator) {
                        case "+" -> {
                            result = part11 + part22;
                            System.out.println(result);
                        }
                        case "-" -> {
                            result = part11 - part22;
                            System.out.println(result);
                        }
                        case "*" -> {
                            result = part11 * part22;
                            System.out.println(result);
                        }
                        case "/" -> {
                            result = part11 / part22;
                            System.out.println(result);
                        }
                        default -> throw new IndexOutOfBoundsException ("Некорректный оператор");
                    }
                } else {
                    throw new NumberFormatException("Исползуйте арабские или римские числа от 1 до 10");
                }
            }
        }

}




