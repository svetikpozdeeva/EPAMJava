package ErrorAndExeptionsMainTask;
import java.util.Arrays;

public class Student {
    public int idStudent, idUniversity;
    public String nameStudent;
    Grade[]  grades;

    public Student(int idStudent, String nameStudent, Grade[] grades) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        if (grades.length == 0) {
            throw new IllegalArgumentException("У студента должен быть хотябы один предмет!");
        }
        this.grades = grades;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public String getAverageAllGrades() {
        int[] newArr = Arrays.stream(grades).flatMapToInt(elem -> Arrays.stream(elem.grade)).toArray();
        int sum = 0;
        for (int j =0; j < newArr.length; j++ ) {
                sum = sum + newArr[j];
        }
        String result = Integer.toString(sum/newArr.length);
        return result;
    }

    public int getAverageGradeOnSubject(Subject subjectEnum) {
        int result1 = 0;
        int[] newArr1;
            newArr1 = Arrays.stream(grades).filter(p -> p.subjectEnum.equals(subjectEnum)).flatMapToInt(elem -> Arrays.stream(elem.grade)).toArray();
            int sum1 = 0;
            for (int j = 0; j < newArr1.length; j++) {
                sum1 = sum1 + newArr1[j];
            }
            if (newArr1.length > 0) {
                result1 = sum1 / newArr1.length;
            }
            return result1;
    }

    public boolean getExceptionByDiapazonGrades() {
        boolean b = false;
        int[] newArr = Arrays.stream(grades).flatMapToInt(elem -> Arrays.stream(elem.grade)).toArray();
        for (int j =0; j < newArr.length; j++ ) {
            if(newArr[j]<=0 || newArr[j]>10) {
                //throw new ArithmeticException("Оценка не в диапазоне 1-10");
                b = true;
            }
        }
        return b;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
