package company.collections.serialization;

import java.io.*;

class Persist{
    public static void main(String args[]){
        try{
            //Creating the object
            Student s1 =new Student(211,"ravi", "math", 1000);
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("output/student_inheritance.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}

        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("output/student_inheritance.txt"));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name+ " " + s.cource + " " + s.fee);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}
