public class MinMaxNumbers {
//    Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
    public static void main(String[] args) {
    int z = 194;
    int x = 90;
    int v = 45;
    int w = 13;
    int q = 195;
    int min;
    int max;
    min = Math.min(z, Math.min(Math.min(x,v), Math.min(w,q)));
    max = Math.max(z, Math.max(Math.max(x,v), Math.max(w,q)));
        System.out.println(min);
        System.out.println(max);
}

}
