
public class colegio extends Edificio{
	private int numeroAulas;
	private boolean pabellon;
	public colegio(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral, int numeroAulas) {
		super(direccion, codigoPostal, altura, calefaccionCentral);
		this.numeroAulas=numeroAulas;
		// TODO Auto-generated constructor stub
	}
	public int getCapacidadColegio(){
		int capacidadColegio;
		capacidadColegio=numeroAulas*30;
		return(capacidadColegio);
	}
	
}
