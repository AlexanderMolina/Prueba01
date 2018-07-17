package base;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaHumo{
	@Autowired
	private Controlador controlador;
	@Test
	public void CargaContexto()throws Exception{
		assertThat(controlador).isNotNull();
	}
}