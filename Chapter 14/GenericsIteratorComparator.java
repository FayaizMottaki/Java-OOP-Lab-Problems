import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class GenericsIteratorComparator {
    public static void main(String[] args) {
        List<StudentRecord> students = new ArrayList<>();
        students.add(new StudentRecord("Asha", 3.72));
        students.add(new StudentRecord("Rafi", 3.45));
        students.add(new StudentRecord("Noor", 3.91));

        printItems(students);
        students.sort(Comparator.comparingDouble(StudentRecord::getCgpa).reversed());
        System.out.println("Sorted by CGPA:");
        for (StudentRecord student : students) System.out.println(student);
    }

    private static <T> void printItems(Iterable<T> items) {
        Iterator<T> iterator = items.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}

final class StudentRecord {
    private final String name;
    private final double cgpa;
    StudentRecord(String name, double cgpa) { this.name = name; this.cgpa = cgpa; }
    double getCgpa() { return cgpa; }
    @Override public String toString() { return name + " (" + cgpa + ")"; }
}
