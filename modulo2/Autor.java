import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private List<Livro> obras;

    public Autor(String nome, int idade, String nacionalidade) {
        super(nome, idade);
        this.nacionalidade = nacionalidade;
        this.obras = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        obras.add(livro);
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public List<Livro> getObras() {
        return obras;
    }
}