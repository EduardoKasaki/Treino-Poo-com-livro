
package projetolivro;

public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folhear(int p);
    public void avancarPag(int p);
    public void voltarPag();
}