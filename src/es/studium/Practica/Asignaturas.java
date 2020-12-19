package es.studium.Practica;

public class Asignaturas
{
	private int codigo;
	private String idiomaNivel;
	private float horas;
	private Persona alumnos;
	private float nota;
	

	/* Constructor por defecto o vacío*/
	public Asignaturas () 
	{
		codigo = 0;
		idiomaNivel = "";
		horas = 0.0f;
		alumnos = new Persona();
		nota = 0.0f;
	}

	/* Constructor con parámetros */
	public Asignaturas (int c, String i, float h, Persona a, float n) 
	{
		codigo = c;
		idiomaNivel = i;
		horas = h;
		alumnos = a;
		nota = n;
	}
	/*Creamos los métodos inspectores*/
	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int c)
	{
		codigo = c;
	}

	public String getIdiomaNivel()
	{
		return idiomaNivel;
	}

	public void setIdiomaNivel(String i)
	{
		idiomaNivel = i;
	}

	public float getHoras()
	{
		return horas;
	}

	public void setHoras(float h)
	{
		horas = h;
	}

	public Persona getAlumnos()
	{
		return alumnos;
	}

	public void setAlumnos(Persona a)
	{
		alumnos = a;
	}
	public float getNota()
	{
		return nota;
	}

	public void setNota(float n)
	{
		nota = n;
	}

}
