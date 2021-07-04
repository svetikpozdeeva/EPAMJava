package ErrorAndExeptionsMainTask;
import java.util.ArrayList;

/*В университете есть несколько факультетов, в которых учатся студенты, объединенные в группы.
У каждого студента есть несколько учебных предметов по которым он получает оценки.
Необходимо реализовать иерархию студентов, групп и факультетов.

Посчитать средний балл по всем предметам студента
Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
Посчитать средний балл по предмету для всего университета
Релизовать следующие исключения:

Оценка ниже 0 или выше 10
Отсутсвие предметов у студента (должен быть хотя бы один)
Отсутствие студентов в группе
Отсутствие групп на факультете
Отсутствие факультетов в университете
*/
public class Main {
    private static Group group102;
    static void getGroup102(Group group){
        group102 = group;
    }

    public static Student getById(int studentId, ArrayList<Student> st)  {
        return st.stream()
                .filter(i -> studentId == i.getIdStudent())
                .findAny()
                .orElse(null);
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student(
                    1,
                    "Pavel",
                    new Grade[] {
                            new Grade (Subject.Psychology, new int[] {3, 5, 10}),
                            new Grade (Subject.Computer_Science, new int[] {7, 5, 10, 8}),
                            new Grade (Subject.Mathematics, new int[] {6, 7, 9, 5, 7}),
                            new Grade (Subject.Physics, new int[] {9, 5, 8, 10})
                    }

            );
            Student student2 = new Student(
                    2,
                    "Nikita",
                    new Grade[] {
                            new Grade (Subject.Psychology, new int[] {8, 6, 9}),
                            new Grade (Subject.Philosophy, new int[] {1, 5, 9, 8}),
                            new Grade (Subject.Chemistry, new int[] {6, 7, 9, 7}),
                            new Grade (Subject.Physics, new int[] {7, 5, 8, 10, 3})
                    }
            );
            Student student3 = new Student(
                    3,
                    "Dasha",
                    new Grade[] {
                            new Grade (Subject.Psychology, new int[] {2, 6, 9}),
                            new Grade (Subject.Philosophy, new int[] {1, 2, 10, 2}),
                            new Grade (Subject.Chemistry, new int[] {6, 7, 9, 7}),
                            new Grade (Subject.Physics, new int[] {7, 5, 8, 10, 3})
                    }
            );
            Student student4 = new Student(
                    4,
                    "Sasha",
                    new Grade[] {
                            new Grade (Subject.Psychology, new int[] {2, 6, 9}),
                            new Grade (Subject.Philosophy, new int[] {10, 9, 10, 9}),
                            new Grade (Subject.Chemistry, new int[] {6, 7, 9, 7}),
                            new Grade (Subject.Physics, new int[] {7, 5, 8, 10, 3}),
                            new Grade(Subject.Mathematics, new int[]{5})
                    }
            );
            Student student5 = new Student(
                    5,
                    "Vasia",
                    new Grade[] {
                            new Grade (Subject.Psychology, new int[] {1,2}),
                            new Grade (Subject.Philosophy, new int[] {10, 9, 10, 9}),
                            new Grade (Subject.Physics, new int[] {7, 5, 8, 10, 3}),
                            new Grade(Subject.Mathematics, new int[]{5})
                    }
            );
            ArrayList<Student> students = new ArrayList<Student>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            students.add(student5);

            Group group = new Group(101, "101", new int []{student1.idStudent});
            Group group1 = new Group(102,  "102", new int[]{student2.idStudent, student3.idStudent});
            Group group2 = new Group(202,  "202", new int[]{student4.idStudent});
            Group group3 = new Group(302,  "302", new int[]{});
            ArrayList<Group> groups = new ArrayList<Group>();
            groups.add(group);
            groups.add(group1);
            groups.add(group2);
            // группа для срабатывания исключения на пустую группу
            //groups.add(group3);

            Institute institute = new Institute(1,"Institute of Business", new int []{group.idGroup, group1.idGroup});
            Institute institute1 = new Institute(2, "Institute IT", new int []{group2.idGroup});
            Institute institute2 = new Institute(3, "Institute of Exceptions", new int []{});
            ArrayList<Institute> institutes = new ArrayList<Institute>();
            institutes.add(institute);
            institutes.add(institute1);
            // факультет для срабатывания исключения на пустой факультет
            //institutes.add(institute2);

            University university = new University(1, "UrFU", new int []{institute.idIntitute, institute1.idIntitute});
            University university1 = new University(2, "MGU", new int []{});
            ArrayList<University> universities = new ArrayList<University>();
            universities.add(university);
            // институт для срабатывания исключения на пустой институт
            //universities.add(university1);

            SubjectEnum subject = new SubjectEnum(Subject.Psychology.ordinal(), "Психология");
            SubjectEnum subject2 = new SubjectEnum(Subject.Philosophy.ordinal(), "Философия");
            SubjectEnum subject3 = new SubjectEnum(Subject.Mathematics.ordinal(), "Математика");
            SubjectEnum subject4 = new SubjectEnum(Subject.Physics.ordinal(), "Физика");
            SubjectEnum subject5 = new SubjectEnum(Subject.Chemistry.ordinal(), "Химия");
            SubjectEnum subject6 = new SubjectEnum(Subject.Computer_Science.ordinal(), "Информатика");
            ArrayList<SubjectEnum> subjects = new ArrayList<SubjectEnum>();
            subjects.add(subject);
            subjects.add(subject2);
            subjects.add(subject3);
            subjects.add(subject4);
            subjects.add(subject5);
            subjects.add(subject6);

        //Посчитать средний балл по всем предметам студента
        System.out.println("Средний балл студента " + student2.nameStudent);
        System.out.println(student2.getAverageAllGrades());

        //Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
        System.out.println("Средний балл студенов по предмету " + Subject.Philosophy.toString()
                + " для группы " + group1.nameGroup
                + " факультета " + institute.nameIntitute  );
        int avrgrade = 0;
        int count = 0;
        // проверка пустых групп
        groups.forEach(e -> {
            if(e.students.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Отсутствие студентов в группе");
            } else {
                if (e.idGroup == 102) {
                    getGroup102(e);
                    return;
                }
            }
        });
        for (int i = 0; i < group102.students.length-1; i++) {
                avrgrade = avrgrade + getById(group102.students[i], students).getAverageGradeOnSubject(Subject.Philosophy);
                count = count+1;
        }
        int avrgrade1 =  avrgrade/count;
        System.out.println(avrgrade1);

        //Посчитать средний балл по предмету для всего университета
        System.out.println("Средний балл студенов по предмету " + Subject.Philosophy.toString() + " для всего университета");
        int avrgrade3 = 0;
        int count2 = 0;
                for (int i = 0; i < students.size()-1; i++) {
                    if(students.get(i).getExceptionByDiapazonGrades() == false) {
                        avrgrade3 = avrgrade3 + students.get(i).getAverageGradeOnSubject(Subject.Philosophy);
                        count2 = count2 + 1;
                    } else {
                        throw new ArithmeticException("Оценка не в диапазоне 1-10 у студента " + students.get(i));
                    }
                }
        int avrgrade4 =  avrgrade3/count2;
        System.out.println(avrgrade4);

        // проверка пустых факультетов
        institutes.forEach(e -> {
            if(e.groups.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Отсутствие групп на факультете");
            }
        });

        // проверка пустых университетов
            universities.forEach(e -> {
                if(e.institutes.length == 0) {
                    throw new ArrayIndexOutOfBoundsException("Отсутствие факультетов в университете");
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
