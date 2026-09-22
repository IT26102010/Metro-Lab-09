import java.util.Scanner;

public class IT26102010Lab9Q4 {

    public static double calculationFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + "               " + finalMark + "             " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Name : ");
            names[i] = scanner.nextLine();

            System.out.print("Assignment Mark (out of 100) : ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Exam Paper Mark (out of 100) : ");
            double examMark = scanner.nextDouble();
            scanner.nextLine();
            System.out.println();
        }

        System.out.println();
        System.out.println("Name            Final Mark      Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}
