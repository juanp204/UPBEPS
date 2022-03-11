
public class ListaEnlazada implements InterfazLista {
	
	private Paciente head;
	
	private int c = 0;
	
	public ListaEnlazada()
        {
            head = new Paciente();	
	}

	public int getC()
        {
            return c;
	}
	
        @Override
	public void Add(String clinica,String sexo, String nombre, String apellido, String id, String historia){	
		if(head!=null&&!head.equals("")){
		
			
			Paciente newPaciente = new Paciente(clinica, sexo, nombre, apellido, id, historia);
			
			Paciente actualPaciente = head;
			

			
			while(actualPaciente.getNext() != null)
			{
				actualPaciente = actualPaciente.getNext();
			}
	

			actualPaciente.setNextNode(newPaciente);
			newPaciente.setPrevNode(actualPaciente);
			
			c=c+1;
			
		}else{
			javax.swing.JOptionPane.showMessageDialog(null,"Debe ingresar un valor");					
		}					
	}
	
        @Override
	public void Print()
	{
		Paciente actualPaciente = head.getNext();
		String out1 = "";
		int elementNumber = 0;
		
		while(actualPaciente != null)
		{
			elementNumber=elementNumber+1;
			out1 += elementNumber+" - ["+ actualPaciente.getClinica()+
                                ","+actualPaciente.getSexo()+","+ actualPaciente.getNombre()+
                                ","+ actualPaciente.getApellido()+","+ actualPaciente.getId()+
                                ","+actualPaciente.getHistoria()+"] \n";
			actualPaciente = actualPaciente.getNext();
		}
		
		if(out1.equals("")){
			out1 = "El listado se encuentra vacío";
		}
		
		javax.swing.JOptionPane.showMessageDialog(null,out1);							
	}

        @Override
	public boolean Search(int posicion)
	{

		if(posicion < 1 || posicion > getC()){
			javax.swing.JOptionPane.showMessageDialog(null,"La posición ingresada no es valida");					
			return false;
		}
		

		Paciente actualPaciente = head.getNext();

		for(int i = 1; i < posicion; i++)
		{

			if(actualPaciente.getNext() == null){
				javax.swing.JOptionPane.showMessageDialog(null,"Dato ingresado no encontrado");					
				return false;
			}

			
			
			actualPaciente = actualPaciente.getNext();
		}
		
		String finalMessage = "";
		finalMessage+=" Paciente encontrado: [ "+actualPaciente.getNombre()+" ] con id: "+posicion;
		
		if(actualPaciente.getPrev()!=null)
			finalMessage+=" ... pasiente Anterior --> "+actualPaciente.getPrev().getNombre();
		else
			finalMessage+=" ... pasiente Anterior --> Nulo";	
		
		if(actualPaciente.getNext()!=null)
		finalMessage+=" y Siguiente pasiente -->  "+actualPaciente.getNext().getNombre();
		else
		finalMessage+=" y Siguiente pasiente --> Nulo";	
		
		javax.swing.JOptionPane.showMessageDialog(null, finalMessage);	
		
		return true;				
	}

        @Override
	public boolean Remove(int posicion)
	{
		if(posicion < 1 || posicion > getC()){
			javax.swing.JOptionPane.showMessageDialog(null,"La posición ingresada no es valida");
			return false;
		}
			
		Paciente actualPaciente = head;
		
		for(int i = 1; i < posicion; i++)
		{
			

			if(actualPaciente.getNext() == null){
				javax.swing.JOptionPane.showMessageDialog(null,"Dato ingresado no encontrado");					
				return false;
			}

			actualPaciente = actualPaciente.getNext();
		}
                
		Paciente pacienteEliminado=actualPaciente.getNext();

		Paciente nuevoElementoSiguiente=actualPaciente.getNext().getNext();
		
		actualPaciente.setNextNode( nuevoElementoSiguiente);
		nuevoElementoSiguiente.setNextNode(actualPaciente);
		
		c--;
		
		javax.swing.JOptionPane.showMessageDialog(null,"Paciente eliminado: ["+pacienteEliminado.getNombre()+","+pacienteEliminado.getApellido()+"] cuya posición era: "+posicion);		
		return true;
	}	
}