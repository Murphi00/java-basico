
package Relacionamento;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Exer02 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Curso curso = new Curso();
        
        System.out.println("informe o nome do curso: ");
        String name = scan.nextLine();
        curso.setName(name);
        
        System.out.println("informe as horas do curso: ");
        String hour = scan.nextLine();
        curso.setHour(hour);
        
        Teacher teacher = new Teacher();
        
        System.out.println("informe o nome do professor do curso: ");
        name = scan.nextLine();
        teacher.setName(name);
        
        System.out.println("informe o email do professor: ");
        String email = scan.nextLine();
        teacher.setEmail(email);
        
        System.out.println("informe o departamento do professor: ");
        String departament = scan.nextLine();
        teacher.setDepartament(departament);
       
        curso.setTeacher(teacher);
        
        Student[] students = new Student[2];
        
        for(int i = 0; i < students.length; i ++){
            Student s = new Student();
            scan.nextLine();
            
            System.out.println("informe o nome do aluno " + (i + 1) + ": ");
            name = scan.nextLine();
            s.setName(name);
            
            System.out.println("informe o numero da matricula de " + s.getName() + ": ");
            String registration = scan.nextLine();
            s.setRegistration(registration);
            
            double[] grades = new double[s.getGrades().length];
            
            for(int x = 0; x  < s.getGrades().length; x++){
                System.out.println("informe a nota " + (x + 1) + " de: " + s.getName());
                grades[x] = scan.nextDouble();
            }
            
            s.setGrades(grades);
            students[i] = s;
        }    
        
        curso.setStudent(students);
        System.out.println(curso.obterInfo());
    }
    
}
