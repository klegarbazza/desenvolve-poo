import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testGetNomeENacionalidade() {
        Autor autor = new Autor("Clarice", 40, "Brasileira", false);
        assertEquals("Clarice", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testEhUsuario() {
        Autor autor1 = new Autor("Carlos", 50, "Brasileiro", true);
        Autor autor2 = new Autor("Ana", 45, "Brasileira", false);
        assertTrue(autor1.isEhUsuario());
        assertFalse(autor2.isEhUsuario());
    }

    @Test
    public void testAdicionarLivro() {
        Autor autor = new Autor("João", 60, "Português", false);
        Livro livro = new Livro("História do Código", autor, "História", true);
        assertTrue(autor.getObras().contains(livro));
    }
}