package Persona;
import java.sql.Date;
import java.util.*;

//import Cuenta;

public class Main01 {
// Atributos private
	
	private String nombre;
	private int edad;
	private Date Fecha_nacimiento;
	private String Poblacion;
	private String Telefono; //Ponemos tipo string ya que no vamos a hacer ninguna operacion matematica con el
	private String Nacionalidad;
	private String Direccion;
	private String DNI;
	private static String Apellido;
	public double peso;
	private double dinero;
	private double cantidad;
	//private Cuenta cuenta;
	
	



	//Constructor
	public Main01 (String nombre, String Apellido){
		this.nombre = nombre;
		this.Apellido = Apellido;
		
	}
	

		 	      
		      

	
	//Metodos public
	
	
	/*public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
*/
	
	public Main01() {
		// TODO Auto-generated constructor stub
	}






	public void gastarDinero(){
		if (this.dinero < cantidad){
			System.out.println("Has gastado mas dinero del que dispones");
		}else{
			setDinero(getDinero() - cantidad);
		}
	}
	
	public int cumplirAnios(){
		this.edad ++;
		return getEdad();
		
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double d) {
		this.dinero = d;
	}
	public void comer(){
		System.out.println("He comido");
	}

	public void correr(){
		System.out.println("He corrido 30 kilometros");
	}
	
	
	public void dormir(){
		System.out.println("Ojala estar durmiendo!");
	}

	public void engordar(int peso){
		this.peso = this.peso + peso;	/*Con this. estamos diciendo que "peso" será el peso 
										definido en el atributo de arriba(clase) y el segundo 
										peso será el nuevo peso que introduzcamos */
		}
	
	public void cambiaredad(int edad){
		this.edad = edad;
	}

	//CORRER
	public void correr(double km){
		double pesoPerdido = 0.05*km;
		this.peso = this.peso - pesoPerdido;
		System.out.println("He corrido " + km +
				"km-s y he perdido " +pesoPerdido+ "kg-s");
	}
	
	public void correr(int minutos){
		
		
		
	}
	
	
	
	public double getCantidad() {
		return cantidad;
	}

	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFecha_nacimiento() {
		return Fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		Fecha_nacimiento = fecha_nacimiento;
	}

	public String getPoblacion() {
		return Poblacion;
	}

	public void setPoblacion(String poblacion) {
		
		Poblacion = poblacion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		if (this.Telefono.length() < 9){
			System.out.println("El telefono es incorrecto");
		}
			else{
				System.out.println("El telefono es correcto");
			}
		
		Telefono = telefono;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		if(DNI.length() < 9){
			System.out.println("El dni es incorrecto");
		}else{
		DNI = dNI;
	}
	}

	public String getApellido() {
		return Apellido;
	}

	public static void setApellido(String apellido) {
		Apellido = apellido;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (this.peso > 0){
			System.out.println("Su peso es correcto");
		}else{
			System.out.println("Su peso es incorrecto");
		}
		
		this.peso = peso;	
	}
	
	public void mostrarNombreApellido(){
		System.out.println("Me llamo " + getNombre() + " y me apellido " + getApellido());
		
		
	}
	
	public String getNombreApellido(){
		return (("Me llamo " + getNombre() + " y me apellido " + getApellido()));
	}
}
