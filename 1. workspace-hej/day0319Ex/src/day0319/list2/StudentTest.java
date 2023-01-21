package day0319.list2;
import java.util.*;
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        
        Student stuArr1 = new Student("은하",20,70,80,90);
        Student stuArr2 = new Student("유재",20,70,80,90);
        Student stuArr3 = new Student("이현",20,70,80,90);
        Student stuArr4 = new Student("솔찬",20,70,80,90);

        arr.add(stuArr1);
        arr.add(stuArr2);
        arr.add(stuArr3);
        arr.add(stuArr4 );


        System.out.println(arr);
    }

}