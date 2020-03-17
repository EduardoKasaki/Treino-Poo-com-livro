

package projetolivro;


public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0]= new Pessoa("Eduardo", 12, "M");
        p[1]= new Pessoa("João", 22, "M");
                

        l[0] = new Livro("Aprendedo Java", "José Silva", 300, p[0]);
        l[1] = new Livro("Testando spring", "José Soares", 22, p[1]);
        l[2] = new Livro("Aprendedo progarmar", "Josué Pereira", 11, p[0]); 
        
        l[0].abrir();
        l[0].folhear(300);
        l[0].avancarPag(300);
        l[0].voltarPag();
        l[0].fechar();
        System.out.println(l[0].Detalhes());
        
    }
    
    
    
}
