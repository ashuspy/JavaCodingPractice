package comparatorAndComparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(13, "Ram"));
        students.add(new Student(35, "Shyam"));
        students.add(new Student(83, "Ashu"));
        students.add(new Student(13, "Rohit"));
        students.add(new Student(65, "Anuj"));

        //   Collections.sort(students, new SortBynameThenMarks());
        // we can create anonymous class without creating new class
//**********************************************************************
//       Collections.sort(students, new Comparator<Student>() {
//           @Override
//           public int compare(Student o1, Student o2) {
//               if (o1.name.equals(o2.name)) {
//                   return o1.marks - o2.marks;
//               }else {
//                   return o1.name.compareTo(o2.name);
//               }
//           }
//       });
//        students.forEach(System.out::println);
//    }
//  }

//using lambda expressions
//************************
//        Collections.sort(students, (o1, o2) -> {
//            if (o1.name.equals(o2.name)) {
//                return o1.marks - o2.marks;
//            } else {
//                return o1.name.compareTo(o2.name);
//            }
//
//        });

    //    Collections.sort(students, (o1,o2) -> o1.name.compareTo(o2.name));
   Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
        students.forEach(System.out::println);
    }
}


//class SortBynameThenMarks implements Comparator<Student> {
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        if (o1.name.equals(o2.name)) {
//            return o1.marks - o2.marks;
//        }else {
//            return o1.name.compareTo(o2.name);
//        }
//    }
//}