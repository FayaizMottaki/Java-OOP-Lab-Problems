public class StudentCgpa {
    public static void main(String[] args) {
        String[] students = {"Asha", "Rafi", "Noor", "Mina", "Omar"};
        String[] subjects = {"OOP", "Math", "English", "Physics", "Data Structures"};
        double[][] gradePoints = {
            {3.75, 3.50, 3.25, 3.75, 4.00},
            {3.25, 3.50, 3.00, 3.25, 3.50},
            {4.00, 3.75, 3.50, 3.75, 3.75},
            {3.50, 3.25, 3.75, 3.50, 3.25},
            {3.00, 3.25, 3.50, 3.00, 3.25}
        };
        double[] credits = {3, 3, 2, 3, 3};
        for (int student = 0; student < students.length; student++) {
            double weightedTotal = 0;
            double creditTotal = 0;
            for (int subject = 0; subject < subjects.length; subject++) {
                weightedTotal += gradePoints[student][subject] * credits[subject];
                creditTotal += credits[subject];
            }
            System.out.printf("%s CGPA: %.2f%n", students[student], weightedTotal / creditTotal);
        }
    }
}
