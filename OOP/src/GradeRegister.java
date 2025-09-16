import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesPoints;

    public GradeRegister(){
        this.grades = new ArrayList<>();
        this.gradesPoints = new ArrayList<>();
    }

    public static int pointsToGrades(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public void addGradeBasedOnPoints(int points) {
        this.gradesPoints.add(points);
        this.grades.add(pointsToGrades(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades(){

        if(this.grades.isEmpty()){
            return -1;
        }

        int counter = 0;
        int sum = 0;

        for (Integer grade : grades) {
            sum+=grade;
            counter++;
        }

        return (double) sum/counter;
    }

    public double averageOfPoints(){

        if(this.gradesPoints.isEmpty()){
            return -1;
        }

        int counter = 0;
        int sum = 0;

        for (Integer gradePoint : gradesPoints) {
            sum+=gradePoint;
            counter++;
        }

        return (double) sum/counter;
    }



}
