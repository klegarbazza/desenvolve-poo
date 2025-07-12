import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PublicacaoStrategyTest {

    @Test
    public void testPublicacaoLivro() {
        Autor autor = new Autor("João", 40, "Brasileiro", true);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        autor.publicar();

        String resultado = out.toString().trim();
        assertEquals("Publicando um livro...", resultado);
    }

    @Test
    public void testPublicacaoArtigo() {
        Autor autor = new Autor("Maria", 30, "Portuguesa", true);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        autor.publicar();

        String resultado = out.toString().trim();
        assertEquals("Publicando um artigo...", resultado);
    }
}