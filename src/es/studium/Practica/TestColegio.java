package es.studium.Practica;

public class TestColegio
{

	public static void main(String[] args)
	{
		/*Creo los colegios (objetos de la clase Colegio) pasándole los valores al constructor*/
		Colegio c1 = new Colegio (1, "Escuela de inglés", "Reyes Católicos, 14", "Ana Abel, Benito Bueno, Carmen Cano");
		Colegio c2 = new Colegio (2, "Escuela de francés", "Cristobal Colón, 92", "Esteban Escalera, Francisco Farfán");
		
		/*Creo las personas o alumnos (objetos de la clase Persona) pasándole los valores al constructor*/
		Persona p1 = new Persona (1, "Ana Abel", "Paseo de América, 15", c1);
		Persona p2 = new Persona (2, "Benito Bueno", "Reyes Católicos, 16", c1 );
		Persona p3 = new Persona (3, "Carmen Cano", "Reyes Católicos, 2", c1);
		Persona p4 = new Persona (4, "Esteban Escalera", "Isabel la Católica, 28", c2);
		Persona p5 = new Persona (5, "Francisco Farfán", "Cristóbal Colón, s/n", c2);
		
		/*Creo las asignaturas (objetos de la clase Asignaturas) pasándole los valores al constructor*/
		Asignaturas a11 = new Asignaturas(11, "Inglés B1", 1f, p1, 7f );
		Asignaturas a12 = new Asignaturas(11, "Inglés B1", 1f, p3, 5f );
		Asignaturas a21 = new Asignaturas(21, "Inglés B2", 1f, p2, 6f );
		Asignaturas a32 = new Asignaturas(32, "Francés B1", 1.30f, p4, 9f );
		Asignaturas a31 = new Asignaturas(31, "Francés A2", 2f, p5, 8.5f );
		
		
		/*Muestro por la consola la dirección de los colegios*/	
		System.out.println("La dirección del centro de inglés es " + c1.getDireccion() + " y la del centro de francés es "+ c2.getDireccion());
		/*Muestro por la consola la dirección de los colegios*/	
		System.out.println("La dirección del centro en el que está matriculada Carmen es " + p1.getColegio().getDireccion());
		/*Muestro por la consola la nota de Benito en el B2*/
		System.out.println("La nota que Benito ha sacado en el B2 es " + a21.getNota());

	}

}
