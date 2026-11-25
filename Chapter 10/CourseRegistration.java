import java.time.LocalDateTime;

public class CourseRegistration {
    public static void main(String[] args) {
        Student student = new Student(2024831067, "Asha Rahman", "Software Engineering");
        Instructor instructor = new Instructor(42, "Dr. Karim", "CSE", "Lecturer");
        Course course = new Course(2123, "Object-Oriented Programming", "OOP syllabus", 3, "Programming I");
        CourseOffering offering = new CourseOffering(student, instructor, course,
                LocalDateTime.of(2026, 11, 25, 10, 0), 1, "Room 402", 2026, "1st");
        System.out.println(offering);
    }
}

final class Student {
    private final long id;
    private final String name;
    private final String program;
    Student(long id, String name, String program) { this.id = id; this.name = name; this.program = program; }
    long getId() { return id; }
    String getName() { return name; }
}

final class Instructor {
    private final long id;
    private final String name;
    private final String department;
    private final String title;
    Instructor(long id, String name, String department, String title) {
        this.id = id; this.name = name; this.department = department; this.title = title;
    }
    String getName() { return name; }
}

final class Course {
    private final long id;
    private final String title;
    private final String syllabus;
    private final int credits;
    private final String prerequisite;
    Course(long id, String title, String syllabus, int credits, String prerequisite) {
        this.id = id; this.title = title; this.syllabus = syllabus; this.credits = credits; this.prerequisite = prerequisite;
    }
    String getTitle() { return title; }
}

final class CourseOffering {
    private final Student student;
    private final Instructor instructor;
    private final Course course;
    private final LocalDateTime time;
    private final int sectionNumber;
    private final String room;
    private final int year;
    private final String semester;

    CourseOffering(Student student, Instructor instructor, Course course, LocalDateTime time,
                   int sectionNumber, String room, int year, String semester) {
        this.student = student; this.instructor = instructor; this.course = course; this.time = time;
        this.sectionNumber = sectionNumber; this.room = room; this.year = year; this.semester = semester;
    }

    @Override
    public String toString() {
        return student.getName() + " registered in " + course.getTitle() + " with "
                + instructor.getName() + " | section " + sectionNumber + " | " + room
                + " | " + semester + " " + year + " | " + time;
    }
}
