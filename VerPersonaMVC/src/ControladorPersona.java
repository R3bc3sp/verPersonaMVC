import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPersona implements ActionListener{
	Persona p;
	VPersona vPer;
	public ControladorPersona(Persona p, VPersona vPer) {
		super();
		this.p = p;
		this.vPer = vPer;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Obtener de qué componente viene el evento
		Object obj = e.getSource();
		//ifs para que se ejecuten los eventos con su componente correspondiente
		if (obj == vPer.btnCalcularEdad){
			calcularEdadVentana();
		}
		if (obj == vPer.btnSalir){
			salir();
		}
		
	}
	private void calcularEdadVentana() {
		// TODO Auto-generated method stub
	
		p.setNombre(vPer.textNombre.getText());
		p.setApellido(vPer.textApellido.getText());
		p.setAnyoNcto(Integer.parseInt(vPer.textAnyo.getText()));
		//p= new Persona(textNombre.getText(),textApellido.getText(), Integer.parseInt(textAnyo.getText()) );
		vPer.lblMostrarEdad.setText(p.toString());
	}
	private void salir(){
		vPer.dispose();
	}
	

	
	
	
}
