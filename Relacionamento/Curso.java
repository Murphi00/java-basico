/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relacionamento;

/**
 *
 * @author lisle
 */
public class Curso {

    private String name;
    private String hour;
    private Teacher teacher;
    private Student[] student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
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

    public String obterInfo() {
        String info = "nome do curso: " + name + "\nCarga horária: " + hour + "\n";
        if (teacher != null) {
            info += teacher.obterInfo();
        }

        if (student != null) {
            info += "\nLista dos Alunos: ";
            if (student != null) {
                for (Student s : student) {
                    info += s.obterInfo() + "\n";
                }
            }

            info += "media da turma: " + mediaTurma();
        }

        return info;
    }

    public double mediaTurma() {
        double soma = 0;

        if (student != null) {
            for (Student s : student) {
                soma += s.obterMedia();
            }
        }

        return soma / student.length;
    }
}
