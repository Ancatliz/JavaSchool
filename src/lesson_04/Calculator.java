package lesson_04;

public class Calculator {
    public static class Main {
        public static void main(String[] args) {


            float a = 15;
            float b = 6;
            char symbol = '/';

            calcSwitch(a, b, '+');
            calcSwitch(a, b, '-');
            calcSwitch(a, b, '*');
            calcSwitch(a, b, '/');
            calcSwitch(a, b, 'd');

            System.out.println();

            calc(a, b, '+');
            calc(a, b, '-');
            calc(a, b, '*');
            calc(a, b, '/');
            calc(a, b, 'c');
        }

        private static void calc(float a, float b, char symbol) {
            if (symbol == '+') {
                System.out.println("Сумма = " + (a + b));
            } else if (symbol == '-') {
                System.out.println("Разница = " + (a - b));
            } else if (symbol == '*') {
                System.out.println("Произедение = " + (a * b));
            } else if (symbol == '/') {
                System.out.println(a / b);
            } else {
                System.out.println("Неверное выражение");
            }
        }

        private static void calcSwitch(float a, float b, int symbol) {
            switch (symbol) {
                case '+': {
                    System.out.println("Сумма = " + (a + b));
                    break;
                }
                case '*': {
                    System.out.println("Произедение = " + (a * b));
                    break;
                }
                case '-': {
                    System.out.println("Разница = " + (a - b));
                    break;
                }
                case '/': {
                    System.out.println(a / b);
                    break;
                }
                default: {
                    System.out.println("Неверное выражение");
                }
            }
        }
    }
}
