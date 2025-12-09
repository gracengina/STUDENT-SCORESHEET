import java.util.Scanner;

public class student_scoresheet {
    public static void main(String[] args) {
        // Rank Count Initialization
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        // Input School Details
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter School Name: ");
        String schoolName = scanner.nextLine();
        System.out.print("Enter Teacher name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter Grade: ");
        Character grade = scanner.next().charAt(0);
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        // Arrays
        String[] StudentNames = new String[11];
        float[] English = new float[11];
        float[] Math = new float[11];
        float[] Science = new float[11];
        float[] History = new float[11];
        float[] Geography = new float[11];
        float[] Programming = new float[11];
        float[] studentTotal = new float[11];
        String[] studentRank = new String[11];
        float[] subjectTotals = new float[6];
        float[] subjectAverages = new float[6];

        // Input Student Records
        System.out.println("Student Details");
        for (int i = 0; i < 11; i++){
            System.out.println("Enter Details for Student "+ (i+1));
            // clear input buffer
            scanner.nextLine();

            System.out.print("Name: ");
            StudentNames[i] = scanner.nextLine();
            System.out.print("English: ");
            English[i] = scanner.nextFloat();
            System.out.print("Math: ");
            Math[i] = scanner.nextFloat();
            System.out.print("History: ");
            History[i] = scanner.nextFloat();
            System.out.print("Geography: ");
            Geography[i] = scanner.nextFloat();
            System.out.print("Science: ");
            Science[i] = scanner.nextFloat();
            System.out.print("Programming: ");
            Programming[i] = scanner.nextFloat();
        }

        // Compute Results
        for(int i = 0; i < 11; i++){
            // Student Totals
            studentTotal[i] = English[i] + Math[i] + History[i] + Geography[i] + Science[i] + Programming[i];

            // Rank
            if(studentTotal[i] >= 540.0){
                studentRank[i] = "A";
            } else if(studentTotal[i] >= 480.0){
                studentRank[i] = "B";
            } else if(studentTotal[i] >= 420.0){
                studentRank[i] = "C";
            } else if(studentTotal[i] >= 360.0){
                studentRank[i] = "D";
            } else {
                studentRank[i] = "F";
            }

            // Rank count
            if (studentRank[i].equals("A")) {
                countA++;
            } else if (studentRank[i].equals("B")) {
                countB++;
            } else if (studentRank[i].equals("C")) {
                countC++;
            } else if (studentRank[i].equals("D")) {
                countD++;
            } else {
                countF++;
            }

            // Compute Results
            subjectTotals[0] += English[i];
            subjectTotals[1] += Math[i];
            subjectTotals[2] += History[i];
            subjectTotals[3] += Geography[i];
            subjectTotals[4] += Science[i];
            subjectTotals[5] += Programming[i];
        }

        // Class Totals
        float classTotal = subjectTotals[0] + subjectTotals[1] + subjectTotals[2] + subjectTotals[3] + subjectTotals[4] + subjectTotals[5];

        // Averages
        for(int i = 0; i < 6; i++){
            subjectAverages[i] = subjectTotals[i] / 11;
        }
        float classAverage = classTotal / 11;

        // Output
        String dashLine = "-----------------------------------------------------------------------------------------------------------------------";
        String equalsLine = "========================================================================================================================";

        // Header
        System.out.println("\n" + dashLine);
        System.out.printf("%50s %s \n", "School Name:", schoolName);
        System.out.printf("%50s %s \n", "Teacher:", teacherName);
        System.out.printf("%50s %c \n", "Grade:", grade);
        System.out.printf("%50s %d \n", "Year:", year);

        // Columns
        System.out.println(equalsLine);
        System.out.printf("%-20s %-9s %-9s %-9s %-10s %-9s %-12s %-9s %-5s\n",
                "Student Name", "English", "Math", "History", "Geography", "Science", "Programming", "Total", "Rank");
        System.out.println(equalsLine);

        // Rows
        for (int i = 0; i < 11; i++) {
            System.out.printf("%-20s %-9.2f %-9.2f %-9.2f %-10.2f %-9.2f %-12.2f %-9.2f %-5s\n",
                    StudentNames[i], English[i], Math[i], History[i], Geography[i], Science[i], Programming[i], studentTotal[i], studentRank[i]);
        }
        System.out.println(dashLine);

        // Totals Footer
        System.out.printf("%-20s %-9.2f %-9.2f %-9.2f %-10.2f %-9.2f %-12.2f %-9.2f\n",
                "", subjectTotals[0], subjectTotals[1], subjectTotals[2], subjectTotals[3], subjectTotals[4], subjectTotals[5], classTotal);

        // Averages Footer
        System.out.printf("%-20s %-9.2f %-9.2f %-9.2f %-10.2f %-9.2f %-12.2f %-9.2f\n",
                "", subjectAverages[0], subjectAverages[1], subjectAverages[2], subjectAverages[3], subjectAverages[4], subjectAverages[5], classAverage);

        System.out.println(equalsLine);

        // Rank Summary
        System.out.printf("%25s %4s A's: %-4d B's: %-4d C's: %-4d D's: %-4d F's: %-4d\n",
                "Ranks", "", countA, countB, countC, countD, countF);
    }
}