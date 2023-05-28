package question_1;

public class Person {
    String name;
    String idCard;
    String address;
    int age;

    public Person() {
        
    }
    @Override
    public String toString(){
        return "\n\tName\t\t"+name+"\n\tID Card No\t"+idCard;//+"\t"+address+"\t"+age;
    }   
}

