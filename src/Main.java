public class Main {
    public static void main(String[] args) {
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        firstName = firstName.replace("ё","е"); //Task3
        middleName = middleName.replace("ё","е"); //Task3
        String fullName = lastName +firstName +middleName;
        fullName = fullName.toUpperCase(); // Task2
        System.out.println("ФИО сотрудника = " + fullName);
    }
}