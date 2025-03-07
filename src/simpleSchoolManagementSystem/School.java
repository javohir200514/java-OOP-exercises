package simpleSchoolManagementSystem;

public class School {
    private Teacher[] teachers;
    private Student[] students;

    public School(Student[] students, Teacher[] teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
    }

   /* public double getTotalMoneyEarned(Student student,Teacher teacher){

    }

    public double getTotalMoneySpend(Student student,Teacher teacher){
        double totalSalaries = 0;
        for (int i = 0; i < numTeachers; i++) {
            totalSalaries += teachers[i].getSalaryEarned();
        }
        return totalSalaries;
    }*/


}
