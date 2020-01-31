package company.collections.serialization;

public class Student extends Person {
    public int fee;
    transient String cource;
    public Student(int id, String name, String cource, int fee){
        super(id, name);
        this.cource = cource;
        this.fee = fee;
    }
}
