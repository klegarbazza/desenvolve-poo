import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", 35, "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        Date agora = new Date();

        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
        }

        Emprestimo emprestimo = new Emprestimo(livro, usuario, agora, agora);
        System.out.println();
        emprestimo.imprimir();
    }
}