package LabSess2;

public class Person {

    String name;
    String idCard;

    public Person() {

    }

    public Person(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }
    
    @Override
    public String toString() {
        return "\n\tName\t\t" + name + "\n\tID Card No\t" + idCard;//+"\t"+address+"\t"+age;
    }

    @Override
    public boolean equals(Object o) {
        if  ((o instanceof Person)
                && ((Person) o).name.matches(this.name)
                && ((Person) o).idCard.matches(idCard)
            ) 
        {
            return true;
        } else {
            return false;
        }

    }

}
