package app.client;

import java.util.List;
import java.util.Scanner;

import app.domain.CursoDTO;
import app.domain.FormaPagoDTO;
import app.domain.InscripcionDTO;
import app.logical.Facade;

public class App
{
	public static void main(String args[])
	{
		// instancio el Facade
		Facade f=new Facade();

		// muestro la pantalla de inscripcion
		_mostrarPantallaInsc(f);

		// ingreso de datos
		InscripcionDTO dto=_ingresoDatos();

		// proceso la inscripcion
		int idInsc=f.registrarInscripcion(dto);

		// muestro pantalla de confirmacion
		_mostrarPantallaConfirm(idInsc);
	}

	private static void _mostrarPantallaConfirm(int idInsc)
	{
		System.out.println("Su inscripcion fue registrada con el id: "+idInsc);
	}

	private static void _mostrarPantallaInsc(Facade f)
	{
		// obtengo la lista de cursos
		List<CursoDTO> cursos=f.obtenerCursos();

		// obtengo la lista de formas de pago
		List<FormaPagoDTO> formasPago=f.obtenerFormasPago();

		System.out.println("-- CURSOS --");
		for(CursoDTO dto:cursos)
		{
			// muestro codigo de curso y descripcion
			System.out.print(dto.getIdCurso()+" - ");
			System.out.print(dto.getDescripcion());
			System.out.println();
		}

		System.out.println("-- FORMAS DE PAGO --");
		for(FormaPagoDTO dto:formasPago)
		{
			// muestro codigo de forma de pago y descripcion
			System.out.print(dto.getIdFormaPago()+" - ");
			System.out.print(dto.getDescripcion());
			System.out.println();
		}
	}

	private static InscripcionDTO _ingresoDatos()
	{
		// instancio un scanner para ingresar datos por teclado
		Scanner scanner=new Scanner(System.in);

		// Ingrese su nombre
		System.out.print("Ingrese su nombre: ");
		String nom=scanner.next();

		System.out.print("Ingrese su telefono: ");
		String tel=scanner.next();

		System.out.print("Ingrese el codigo de curso: ");
		int idCurso=scanner.nextInt();

		System.out.print("Ingrese el codigo de forma de pago: ");
		int idFormaPago=scanner.nextInt();

		// instancio el dto que debo retornar y asigno sus valores
		InscripcionDTO dto=new InscripcionDTO();
		dto.setNombre(nom);
		dto.setTelefono(tel);
		dto.setIdCurso(idCurso);
		dto.setIdFormaPago(idFormaPago);

		return dto;
	}

}
