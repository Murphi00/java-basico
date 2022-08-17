/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAtributos;

import java.util.Date;

/**
 *
 * @author alan
 */
public class Exer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LivroBiblioteca livro = new LivroBiblioteca();
        livro.ano = 2009;
        livro.autor = "loiane";
        livro.editora = "green";
        livro.emprestadoPara = "Alan";
        livro.dataEmprestimo = new Date();
    }
    
}
