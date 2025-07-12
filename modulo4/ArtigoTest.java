import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testCriacaoArtigo() {
        Autor autor = new Autor("Ada Lovelace", 28, "Inglesa", false);
        Artigo artigo = new Artigo("Introdução à Lógica", autor, "Tecnologia", true);

        assertEquals("Introdução à Lógica", artigo.getTitulo());
        assertEquals("Ada Lovelace", artigo.getAutor().getNome());
        assertEquals("Tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}