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

        System.out.println("Задание 4");
        fullName = "Иванов Иван Иванович";
        int a = fullName.indexOf(' ');
        int b = fullName.indexOf(' ', a+1);
        int c = fullName.lastIndexOf(' ');
        System.out.println("Имя сотрудника - " + fullName.substring(a,b));
        System.out.println("Отчество сотрудника" + fullName.substring(c));
        System.out.println("Фамилия сотрудника - " + fullName.substring( 0, a) + "\n");

        System.out.println("Задание 5");
        fullName = "иванов иван иванович";
        char [] name = fullName.toCharArray();
        for (int i = 1; i < name.length; i++){
            if(name[i - 1] == ' ' &&  name[i] != ' ' && name[0] != ' ')
                name[i] = Character.toUpperCase(name[i]);
        }
        if (name[0] != ' ')
            name[0] = Character.toUpperCase(name[0]);
        System.out.println(name);

    }
}