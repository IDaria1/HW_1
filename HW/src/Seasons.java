public class Seasons {
//    Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
    public static void main(String[] args) {
    int month = 12 ;
    String monthString;
switch (month) {
        case 1:
        case 2:
        case 3:
            monthString = "зима";
            break;
        case 4:
        case 5:
        case 6:
            monthString = "весна";
            break;
        case 7:
        case 8:
        case 9:
            monthString = "лето";
            break;
        case 10:
        case 11:
        case 12:
            monthString = "осень";
            break;
    default:
        throw new IllegalStateException("Unexpected value: " + month);
}
System.out.print(monthString);
}
}
