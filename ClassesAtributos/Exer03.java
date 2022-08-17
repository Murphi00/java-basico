/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAtributos;

/**
 *
 * @author alan
 */
public class Exer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();
        
        livro.nome = "conceitos java";
        livro.autor = "leando james";
        livro.editora = "gente";
        livro.ano = 2000;
        livro.idioma = "portugues";
        livro.preco = 45.69;
        livro.nPaginas = 175;
        livro.isbn = "bxuxsmoeo-344";
        
        System.out.println("livro nome: " + livro.nome);
    }
    
}
