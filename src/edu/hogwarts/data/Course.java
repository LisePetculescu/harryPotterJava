package edu.hogwarts.data;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.Subject;
import edu.hogwarts.data.TeachingMaterial;

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subject: ").append(this.subject.toString()).append("\n");
        System.out.println("\n");
        sb.append("Teacher: ").append(this.teacher.toString()).append("\n");
        System.out.println("\n");
        sb.append("Students:\n");
        Student[] var2 = this.students;
        int var3 = var2.length;

        int var4;
        for(var4 = 0; var4 < var3; ++var4) {
            Student student = var2[var4];
            sb.append("- ").append(student).append("\n").append("\n");
        }

        sb.append("Teaching Materials:\n");
        TeachingMaterial[] var6 = this.materials;
        var3 = var6.length;

        for(var4 = 0; var4 < var3; ++var4) {
            TeachingMaterial material = var6[var4];
            sb.append("- ").append(material).append("\n");
            System.out.println("\n");
        }

        return sb.toString();
    }

    public Subject getSubject() {
        return this.subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public TeachingMaterial[] getMaterials() {
        return this.materials;
    }

    public void setMaterials(TeachingMaterial[] materials) {
        this.materials = materials;
    }
}
