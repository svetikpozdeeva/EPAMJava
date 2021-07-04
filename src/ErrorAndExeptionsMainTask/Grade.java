package ErrorAndExeptionsMainTask;

public class Grade {
    Subject subjectEnum;
    public int grade[];

    public Grade(Subject subjectEnum, int[] grade)  {
        this.subjectEnum = subjectEnum;
        this.grade = grade;
    }
}
