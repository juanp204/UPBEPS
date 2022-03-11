
public interface InterfazLista {

	/*ESTOS M TODOS ABSTRACTOS DEBEN SER USADOS EN LA CLASE QUE IMPLEMENTE LA INTERFAZ*/
	
	public void Add(String clinica,String sexo, String nombre, String apellido, String id, String historiaClinica);
	public void Print();
	public boolean Search(int posicion);
	public boolean Remove(int posicion);
	
	
}
