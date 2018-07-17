package base;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Controlador{
	private final Servicio servicio;
	public Controlador(Servicio servicio){
		this.servicio=servicio;
	}
	@RequestMapping("/")
	public @ResponseBody String mostrarMensaje(){
		return "Servidor activo";
	}
	@RequestMapping("/detener")
	public void detener(){
		System.exit(0);
	}
	@RequestMapping("/servidor")
	public @ResponseBody String servidor(){
		return servicio.mostrarMensaje();
	}	
}