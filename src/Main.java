import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String space = " ";
        String fullName;
        fullName = lastName + space + firstName + space + middleName;
        System.out.println("ФИО сотрудника - " + fullName + "\n");


        System.out.println("Задание 2");
        fullName = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName + "\n");

        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'e') + "\n");

    }
}