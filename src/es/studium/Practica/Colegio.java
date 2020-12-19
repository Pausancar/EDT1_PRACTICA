package es.studium.Practica;

public class Colegio
{
	/* Definimos los atributos de Colegio*/
	private int codigo;
	private String centro;
	private String direccion;
	private String alumnos;

	/* Constructor por defecto o vacío*/
	public Colegio () 
	{
		codigo = 0;
		centro = "";
		direccion = "";
		alumnos = "";
	}

	/* Constructor con parámetros */
	public Colegio (int cod, String c, String d, String a) 
	{
		codigo = cod;
		centro = c;
		direccion = d;
		alumnos = a;
	}
	
	/*Creamos los métodos inspectores*/
	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int cod)
	{
		codigo = cod;
	}
	public String getCentro()
	{
		return centro;
	}

	public void setCentro(String c)
	{
		centro = c;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String d)
	{
		direccion = d;
	}

	public String getAlumnos()
	{
		return alumnos;
	}

	public void setAlumnos(String a)
	{
		alumnos = a;
	}

}
