
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		VPersona vPer = new VPersona();
		ControladorPersona controlPer = new ControladorPersona(p, vPer);
		
		vPer.setControlador(controlPer);
		vPer.setVisible(true);
	}

}
