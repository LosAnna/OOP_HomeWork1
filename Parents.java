public class Parents extends Grandparents{
    private String firstName;
    private String secondName;
    private int age;
    private String status;

    public String mother(){
        firstName = "Светлана";
        secondName = "Петрова";
        age = 35;
        status = "Мама";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }

    public String father(){
        firstName = "Олег";
        secondName = "Петров";
        age = 37;
        status = "Папа";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
}