import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testGetNomeENacionalidade() {
        Autor autor = new Autor("Clarice", "Brasileira");
        assertEquals("Clarice", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testAdicionarLivro() {
        Autor autor = new Autor("Clarice", "Brasileira");
        Livro livro = new Livro("Códigos Poéticos", autor, "Ficção", true);
        assertTrue(autor.getObras().contains(livro));
    }
}