import com.cice.Exceptions.controller.Controlador;
import com.cice.Exceptions.util.exceptions.MatExceptions;

public class Main {

	public static void main(String[] args) {
		Controlador controlador = new Controlador();

		try {
			controlador.operaciones("division", 5.0, 25.0);
			controlador.operaciones("multiplicacion", 1.0, 5.0);
			controlador.operaciones("sumar", 2.0, 5.0);
			controlador.operaciones("restar", 2.0, 2.0);
		} catch (MatExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
