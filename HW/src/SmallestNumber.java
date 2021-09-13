public class SmallestNumber {
    //  Даны 4 числа типа int. Сравнить их и вывести наибольшее на консоль.
    public static void main(String[] args) {
        int one = 3;
        int two = 8;
        int three = 8;
        int four = 9;

        int answer = Math.min(Math.min(one, four), Math.min(two, three));
        System.out.println(answer);
    }

    public static class SmallestNumber2 {
        //    Вывести на консоль количество максимальных чисел среди этих четырех.
        public static void main(String[] args) {
            int a = 3;
            int b = 8;
            int c = 9;
            int d = 9;
            int e = 0;

            {
                if ((a >= b) & (a >= b) & (a >= c)) e++;
                if ((b >= a) & (b >= c) & (b >= d)) e++;
                if ((c >= a) & (c >= b) & (c >= d)) e++;
                if ((d >= a) & (d >= b) & (d >= c)) e++;
            }
            System.out.println("Количество максимальных чисел среди этих четырех: " + e);
        }
    }
}
