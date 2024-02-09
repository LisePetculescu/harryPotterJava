import java.util.Arrays;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private Student[] students;
    private TeachingMaterial[] materials;

    public Course(Subject subject, Teacher teacher, Student[] students, TeachingMaterial[] materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = materials;
    }

    public Course() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subject: ").append(subject.toString()).append("\n");
        System.out.println("\n");
        sb.append("Teacher: ").append(teacher.toString()).append("\n");
        System.out.println("\n");
        sb.append("Students:\n");
        for (Student student : students) {
            sb.append("- ").append(student).append("\n").append("\n");

        }


        sb.append("Teaching Materials:\n");
        for (TeachingMaterial material : materials) {
            sb.append("- ").append(material).append("\n");
            System.out.println("\n");
        }
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        return "Course{" +
//                "subject=" + subject +
//                ", teacher=" + teacher +
//                ", students=" + Arrays.toString(students) +
//                ", materials=" + Arrays.toString(materials) +
//                '}';
//    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public TeachingMaterial[] getMaterials() {
        return materials;
    }

    public void setMaterials(TeachingMaterial[] materials) {
        this.materials = materials;
    }
}
