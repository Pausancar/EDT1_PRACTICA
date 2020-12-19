package es.studium.Practica;

public class Persona
{
	/* Defino los atributos de Persona*/
	private int numeroMatricula;
	private String nombre;
	private String direccion;
	private Colegio colegio;

	/* Constructor por defecto o vacío*/
	public Persona () 
	{
		numeroMatricula = 0;
		nombre = "";
		direccion = "";
		colegio = new Colegio();
	}

	/* Constructor con parámetros */
	public Persona (int num, String n, String d, Colegio c) 
	{
		numeroMatricula = num;
		nombre = n;
		direccion = d;
		colegio = c;
	}
	
	/*Creo los métodos inspectores*/
	public Colegio getColegio()
	{
		return colegio;
	}

	public void setColegio(Colegio colegio)
	{
		this.colegio = colegio;
	}

	public int getNumeroMatricula()
	{
		return numeroMatricula;
	}

	public void setNumeroMatricula(int num )
	{
		numeroMatricula = num;
	}
	
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String n)
	{
		nombre = n;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String d)
	{
		direccion = d;
	}

}
