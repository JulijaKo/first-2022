import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("The Tester");
        valera.setEmail("valeruncik@test.lv");
        valera.setPhone("+37120309090");

        Student liga = new Student("Liga", "Ivanova", "liga@test.lv", "+37129292929");
        Student dimko = new Student("Dimko", "Skatinko", "omg@test.lv", "007");
        Student artis = new Student("Artis", "Greatest", "", "112");

        List<Student> students = new ArrayList<>();
        students.add(valera);
        students.add(liga);
        students.add(dimko);
        students.add(artis);

        //----------FOR-------------
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFirstName());

        }
        //------------FOREACH-----------
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }

        //-------FOREACH with IF----
        System.out.println("Printing students with nr.+371");
        for (Student s : students) {
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());
            }
        }
    }
}
