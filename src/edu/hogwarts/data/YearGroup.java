package edu.hogwarts.data;

import edu.generic.Student;
import edu.generic.Teacher;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearGroup {
    private int schoolYear;
    private LocalDate beginningOfSchoolYear;
    private Student[] students;

    public YearGroup(int schoolYear, LocalDate beginningOfSchoolYear, Student[] students) {
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.students = students;
    }

    public YearGroup() {
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public LocalDate getBeginningOfSchoolYear() {
        return beginningOfSchoolYear;
    }

    public void setBeginningOfSchoolYear(LocalDate beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("School Year: ").append(schoolYear).append("\n");
        sb.append("Beginning of School Year: ").append(beginningOfSchoolYear.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).append("\n");
        sb.append("Students:\n");
        for (Student student : students) {
            sb.append("- ").append(student.getFullName()).append("\n");
        }
        return sb.toString();
    }

    public static class Course {
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
            sb.append("edu.hogwarts.data.Subject: ").append(subject.toString()).append("\n");
            System.out.println("\n");
            sb.append("edu.generic.Teacher: ").append(teacher.toString()).append("\n");
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
    //        return "edu.hogwarts.data.YearGroup.Course{" +
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
}
