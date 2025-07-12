import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean ehUsuario;
    private List<Livro> obras;
    private PublicavelInterface estrategiaPublicacao;

    public Autor(String nome, int idade, String nacionalidade, boolean ehUsuario) {
        super(nome, idade);
        this.nacionalidade = nacionalidade;
        this.ehUsuario = ehUsuario;
        this.obras = new ArrayList<>();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public boolean isEhUsuario() {
        return ehUsuario;
    }

    public List<Livro> getObras() {
        return obras;
    }

    public void adicionarLivro(Livro livro) {
        obras.add(livro);
    }

    public void setEstrategiaPublicacao(PublicavelInterface estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}