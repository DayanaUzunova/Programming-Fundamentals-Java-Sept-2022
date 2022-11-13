package opinionPoll;

public class Person {
    //1.полета - характеристики
    private String name;
    private int age;

    //2.конструктор - създаваме обекти от класа
    public Person(String name, int age){
        //нов обект
        this.name = name;
        this.age = age;
    }
    //3.методи - какво може да прави един обект от класа

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
