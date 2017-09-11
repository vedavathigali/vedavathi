
import java.util.Date;
public class Main {

	public static void main(String[] args) {
StudentGroup gs=new StudentGroup(30);
Date d=new Date(1997,2,28);
Student s1=new Student(1,"veda",d,78.2);
gs.addFirst(s1);
System.out.println(gs.getStudent(0).getId());
}
}
