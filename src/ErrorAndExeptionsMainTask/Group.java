package ErrorAndExeptionsMainTask;

public class Group {
    public int idGroup;
    public String nameGroup;
    public int[] students;

    public Group(int idGroup, String nameGroup, int[] students) {
        this.idGroup = idGroup;
        this.nameGroup = nameGroup;
        this.students = students;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public int[] getStudents() {
        return students;
    }

    public void setStudents(int[] students) {
        this.students = students;
    }
}
