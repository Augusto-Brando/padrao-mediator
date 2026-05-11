package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioMediator {

    @Test
    public void testClienteElogiarCozinha() {
        Cliente cliente = new Cliente();
        String resposta = cliente.elogiarCozinha("Hamburguer delicioso!");
        assertTrue(resposta.contains("O Atendimento agradece seu contato"));
        assertTrue(resposta.contains("A Cozinha agradece a mensagem"));
    }

    @Test
    public void testClienteReclamarCozinha() {
        Cliente cliente = new Cliente();
        String resposta = cliente.reclamarCozinha("Pedido veio frio");
        assertTrue(resposta.contains("O Atendimento agradece seu contato"));
        assertTrue(resposta.contains("A Cozinha vai procurar melhorar"));
    }

    @Test
    public void testClienteSugerirCozinha() {
        Cliente cliente = new Cliente();
        String resposta = cliente.sugerirCozinha("Adicionar opcao vegetariana");
        assertTrue(resposta.contains("O Atendimento agradece seu contato"));
        assertTrue(resposta.contains("A Cozinha vai analisar a sugestao"));
    }

    @Test
    public void testClienteVipElogiarCozinha() {
        ClienteVip clienteVip = new ClienteVip();
        String resposta = clienteVip.elogiarCozinha("Atendimento excelente!");
        assertTrue(resposta.contains("A Cozinha agradece a mensagem"));
    }

    @Test
    public void testCozinhaSingleton() {
        Cozinha instancia1 = Cozinha.getInstancia();
        Cozinha instancia2 = Cozinha.getInstancia();
        assertSame(instancia1, instancia2);
    }

    @Test
    public void testAtendimentoSingleton() {
        Atendimento instancia1 = Atendimento.getInstancia();
        Atendimento instancia2 = Atendimento.getInstancia();
        assertSame(instancia1, instancia2);
    }
}