public class CompareNames {
    //    Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
    public static void main(String[] args) {
        String name_1 = "Daria";
        String name_2 = "Daria";
        if (name_1.equalsIgnoreCase(name_2)) {
            System.out.println("Тезки");
        } else {
            System.out.println("Разные имена");
        }
    }
}
