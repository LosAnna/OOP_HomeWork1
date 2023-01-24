public class Grandparents {
    private String firstName;
    private String secondName;
    private int age;
    private String status;

    public String grandMother(){
        firstName = "Людмила";
        secondName = "Петрова";
        age = 60;
        status = "Бабушка";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
    public String grandFather(){
        firstName = "Игорь";
        secondName = "Петров";
        age = 61;
        status = "Дедушка";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
}
