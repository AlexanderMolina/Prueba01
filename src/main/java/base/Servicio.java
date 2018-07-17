package base;
import org.springframework.stereotype.Service;
@Service
public class Servicio{
	public String mostrarMensaje(){
		return "Mensaje del servicio";
	}
}