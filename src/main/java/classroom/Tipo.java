package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	private int nombre;
	Tipo(int codigo, int nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	Tipo(int codigo) {
		this.codigo = codigo;
	}
}
