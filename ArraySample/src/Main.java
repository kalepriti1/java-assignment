public class Main {
    public static int[] getStudentMarks() {
        int[] marks = {60, 86, 87, 90};
        return marks;
    }

    public static int sumOfMarks() {
        int[] marks = getStudentMarks();
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public static int findTheHighestMarks() {
        int[] marks = getStudentMarks();
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    public static int findTheSecondHighestMarks() {
        int[] marks = getStudentMarks();
        int highestMark = Integer.MIN_VALUE;
        int secondHighestMarks = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > highestMark) {
                secondHighestMarks = highestMark;
                highestMark = mark;
            } else if (mark > secondHighestMarks && mark != highestMark) {
                secondHighestMarks = mark;
            }
        }
        return secondHighestMarks;
    }

    public static int findLowestMarks() {
        int[] marks = getStudentMarks();
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public static int passStudentCount() {
        int[] marks = getStudentMarks();
        int count = 0;
        for (int mark : marks) {
            if (mark >= 50) {
                count++;
            }
        }
        return count;
    }

    public static int failStudentCount() {
        int[] marks = getStudentMarks();
        int count = 0;
        for (int mark : marks) {
            if (mark < 50) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Sum of Marks: " + sumOfMarks());
        System.out.println("Highest Marks: " + findTheHighestMarks());
        System.out.println("Second Highest Marks: " + findTheSecondHighestMarks());
        System.out.println("Lowest Marks: " + findLowestMarks());
        System.out.println("Number of Pass Students: " + passStudentCount());
        System.out.println("Number of Fail Students: " + failStudentCount());
    }
}
