package base;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ProbarSolicitudHTTP{
	@LocalServerPort
	private int puerto;
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	public void verificarElMensajePorDefectoDelServidor()throws Exception{
		(new java.io.PrintStream(new java.io.FileOutputStream(new java.io.File("D:\\Desarrollo\\CEIBA\\log.txt")))).println(this.restTemplate.getForObject("http://localhost:"+puerto+"/",String.class));
		assertThat(this.restTemplate.getForObject("http://localhost:"+puerto+"/",String.class)).contains("XXX");
	}	
}