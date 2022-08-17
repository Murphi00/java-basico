package Relacionamento;

/**
 *
 * @author lisle
 */
public class Student {

    private String name;
    private String registration;
    private double[] grades = new double[4];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public String obterInfo() {
        String info = "\nnome: " + name + " matricula: " + registration;
        info += "\nNotas: ";

        double soma = 0;
        for (double n : grades) {
            info += n + " -- ";
            soma += n;
        }

        info += verificarAprovacao(obterMedia());
        return info;
    }

    public double obterMedia() {
        double soma = 0;
        for (Double g : grades) {
            soma += g;
        }
        return (soma / grades.length);
    }

    public String verificarAprovacao(double media) {
        if (media >= 7) {
            return "\naluno aprovado com média: " + media;
        }

        return "\naluno reprovado com média: " + media;
    }
}
