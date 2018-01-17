import java.util.Iterator;

public class Persona
{

	protected int id;
	protected String nombre;
	protected String Apellidos;
	protected int Edad;

	// constructor, getter y setter
	

	public void Concentrarse() {
		
	}

	public void Viajar() {
		
	}

	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int string) {
		Edad = string;
	}

	//Eliminar un entrenador
	public void eliminarEntrenador(String Entrenador) {
		Iterator<Persona> i = Persona.iterator();
		
		while(i.hasNext()){
			Persona a = i.next();
			if (a.getNombre().equals(Entrenador) ) {
				i.remove();
			}
		}
	}

	private static Iterator<Persona> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}