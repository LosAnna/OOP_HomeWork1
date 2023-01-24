public class main {
    public static void main(String[] args) {
        Children child = new Children("Иван", "Петров", 10 , "Сын");
        System.out.println(child);
        System.out.println(child.mother());
        System.out.println(child.father());
        System.out.println(child.grandFather());
        System.out.println(child.grandMother());
    }
}
