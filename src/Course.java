public class Course  {
    private Subject subject;
    private Teacher teacher;
    private Student[] student;
    private TeachingMaterial[] materials;

    public Course(Subject subject, Teacher teacher, Student[] student, TeachingMaterial[] materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.student = student;
        this.materials = materials;
    }

    public Course() {
    }

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

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public TeachingMaterial[] getMaterials() {
        return materials;
    }

    public void setMaterials(TeachingMaterial[] materials) {
        this.materials = materials;
    }
}
