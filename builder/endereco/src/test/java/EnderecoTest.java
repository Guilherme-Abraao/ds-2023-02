import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EnderecoTest {
    @Test
    public void builder() {
        Endereco endereco = Endereco.builder()
                .rua("Alameda Flores")
                .setor("Jardim Planalto")
                .cep("37470-000")
                .numero("1")
                .cidade("Goiânia")
                .estado("Goiás")
                .bloco("1")
                .quadra("1")
                .complemento("1")
                .build();

        assertEquals("Alameda Flores", endereco.getRua());
        assertEquals("Jardim Planalto", endereco.getSetor());
        assertEquals("37470-000", endereco.getCep());
        assertEquals("1", endereco.getNumero());
        assertEquals("Goiânia", endereco.getCidade());
        assertEquals("Goiás", endereco.getEstado());
        assertEquals("1", endereco.getBloco());
        assertEquals("1", endereco.getQuadra());
        assertEquals("1", endereco.getComplemento());
    }
}
