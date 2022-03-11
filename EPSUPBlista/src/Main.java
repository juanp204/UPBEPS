
/**
 *
 * @author Juanp
 */
public class Main {
    public static void main(String[] args) {
		// TODO Auto-generated method stub		
	int opcion=0;
	String Clinica,sexo,nombre,apellido,id,historia;
        String valordeBusqueda;
	ListaEnlazada lista = new ListaEnlazada();
	do{
			
            try
            {
		opcion=Integer.parseInt(javax.swing.JOptionPane.showInputDialog(" \t Menu \t Operaciones con listas dobles -- Pagina Clinica \n 1.- Insertar nuevo paciente \n 2.- Listar paciente \n 3.- Buscar por identificacion \n 4.- Borrar pasiente por posicion \n 5.- Para Salir"));
            }
            catch(Exception e)
            {					
            }
                switch(opcion)
                {
                    case 1:
			Clinica= javax.swing.JOptionPane.showInputDialog("Clínica paciente:");
                        sexo= javax.swing.JOptionPane.showInputDialog("Sexo:");
                        nombre= javax.swing.JOptionPane.showInputDialog("Nombre:");
                        apellido= javax.swing.JOptionPane.showInputDialog("Apellido:");
                        id= javax.swing.JOptionPane.showInputDialog("Identificacion:");
                        historia= javax.swing.JOptionPane.showInputDialog("Historia clinica:");
                        lista.Add("clínica:\n "+Clinica,
                                    "sexo:\n "+sexo,
                                    "nombre:\n "+nombre,
                                    "apellido:\n"+apellido,
                                    "identificacion:\n "+id,
                                    "historia clinica: "+historia);
                            break;
                    case 2:		
                        lista.Print(); //Imprimo la lista
                        break;
                    case 3:
                        valordeBusqueda= javax.swing.JOptionPane.showInputDialog("Digite la posición del paciente en la lista:");
                        lista.Search(Integer.parseInt(valordeBusqueda));
                        break;						      	
                    case 4:
                        valordeBusqueda= javax.swing.JOptionPane.showInputDialog("Digite la posicion del paciente a eliminar");
                        lista.Remove(Integer.parseInt(valordeBusqueda)); // las posiciones empiezan a contar desde 0
                        break;						      										
                    case 5:
                        javax.swing.JOptionPane.showMessageDialog(null,"Quedaron registrados "+lista.getC()+" en pagina");					
                        break;
                    default:
                        javax.swing.JOptionPane.showMessageDialog(null,"Dato ingresado no es valido");					
                        break;							
                }				
        }while( opcion != 5 );          
    }
}
