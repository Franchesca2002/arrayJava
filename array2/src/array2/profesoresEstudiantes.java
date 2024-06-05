import java.util.ArrayList;

import javax.swing.JOptionPane;

package array2;

public class profesoresEstudiantes {
	ArrayList<String> listaProfesores;
	ArrayList<String> listEstudiates;
	ArrayList<ArrayList<String>> listaGeneralEstudiantes;
	
	public profesoresEstudiantes() {
		listaProfesores=new ArrayList<>();
		listaGeneralEstudiantes=new Arraylist<>();
		
	}
	
	public void iniciar() {
		registrarProfesores();
		registrarEstudiantes();
		consultarListaProfesoresyEstudiantes();
		consultaProfesorPorNombre();
		consultaCantidadEstudiantesPorProfesor();
       consultarEstudiantes();
	
	int opcion;
	ArrayList<String> listaProfesores = new Arraylist<>();
	ArrayList<String> listaEstudiantes = new ArrayList<>();
	}
	
	do {
		System.out.println("Menu Principal:");
		System.out.println("1.Registrar profesor");
		System.out.println("2.Registrar estudiante");
		System.out.println("3.Ver lista de profesores");
		System.out.println("4.Ver lista de estudiantes");
		System.out.println("5.Salir");
		System.out.println("Ingrese el numero de la opcion deseada:");
		opcion = scanner.netInt();
		
		switch(opcion) {
		   case 1:
			System.out.println("opcion seleccionada: Registrar profesor");
		   
		   break;
		   case 2:
			   System.out.println("opcion seleccionada: Registrar estudiante");
		   
		   break;
		   case 3:
			   System.out.println("opcion seleonada: Ver lista de profesores");
		   
		   break;
		   case 4:
			   System.out.println("opcion seleccionada: Ver lista de estudiantes");
		   
		   break;
		   case 5:
			   System.out.println("Saliendo del programa...");
			   
		} else {
			
		}
		break;
		case 6;
		 System.out.println("Saliendo del programa...");
		 break;
	 default:System.out.println("opcion no valida. Por favor, ingrese u numero valido");
			   
	}
		
	} while(opcion != 5);
	
	scanner.close();
}
}
	
		}
		
	}


	private void consultarEstudiantes() {
		System.out.println("\n<<<< consulta de estudiante >>>> \n");
		ArrayList<String> listTemporal;
		
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar");
		
		for (int i = 0; < listaGeneralEstudiantes.size(); i++) {
			
			listTemporal=listaGeneralEstudiante.get(i);
			
			if (listTemporal.constains(nombre)) {
				for (int j = 0; j < listaTemporal.size(); j++) {
					
					if(listTemporal.get(j).equalsIgnoreCase(nombre)) {
						System.out.println("Encuentra al nombre: "+nombre+" pertenece al"
								+ "grupo de "+listaProfesores.get(i));
					}
				}
			}else {
				System.out.println("No se encuentra el nombreen el grupo de" +listaProfesores.get(i));
			}
		}
	}

	private void consultaCantidadEstudiantesPorProfesor() {
		System.out.printLn("\n<<<< consulta cantidad de estudiantes de profesores >>>>  \n");
		String nombre=JOptionPane.showInputDialog(!Ingrese el nombre del profesor para saber"
				 + " l cantidad de estudiantes asociados");
		
		if (listaProfesores.constains(nombre)) {
			int posicion=listaProfesores.indexOf(nombre);
			ArrayList<String> listaEstudiantesTemporal=listaGeneralEstudiants.get(posicion);
			System.out.println("La cantidad de estudiantes asociados al profesor " +nombre+""
					+ " es" +litaEstudiantesTemporal.size());
		}else {
			System.out.println("No se encuentra el profesor " +nombre+"\n");
		}
	}

	private void consultaProfesorPorNombre() {
		System.out.println("\n<<<< consulta de profesor >>>>  \n");
		String nombre=JOption.showInputDialog("Ingrese el nombre del  profesor");
		
		if (listaProfesores.constains(nombre)) {
			int posicion=listaProfesores.indexOf(nombre);
			ArrayList<String> listaEstudiantesTemporal=listaGeneralEstudiantes.get(posicion);
			
			System.out.print("profesor: "+ nombre+" = ");
			System.out.print("[");
			for (int j =0; j < listaEstudiantesTemporal.size(); j++) {
				System.out(listaEstudiantesTemporal.get(j));
				if(j<listaEstudiantesTemporal.size()-1) {
					System.out.print(",");
				}
				System.out.print("]\n");
				
			}else {
				System.out.println("No se encuentra el profesor "+nombre+\n);
			}
		}
	}

	private void consultarListaProfesoresyEstudiantes() {
		System.out.println("\n<<<< Lista de profesores y Estudiantes >>>>");
		ArrayList<String> listaTemporal;
		
		for (int i = 0; i < listaGeneralEstudintes.size(); i++) {
			
			listaTemporal=listaGeneralEstudiantes.get(i);
			System.out.print("profesor: "+listaProfesores.get(i)+" = ");
			System.out.print("[");
			for (int j =; j < listaTemporal.size(); j++) {
				System.out.print(listaTemporal.get(j));
				if(j<listaTemporal.size()-1) {
					System.out.print(",");
				}
			}
			System.out.print("]\n");
		}
		
	}
	

	private void registrarProfesores() {
		System.out.prinln("\n<<<< Registro de Profesores >>>>");
		int cant=Integer.parseInt(JOptionpane.showInputDialog("Ingrese la cantidad de profesores"));
		
		for (int i = 0; i <cant ; i++) {
			
			String nombreProfesor=JOptionPane.showInputDialog("nombre Profesor  "+ (i+1));
			listaProfesores.add(nombreProfesor);
		}
		if (listaProfesores.constains(nombre)) {
			System.out.printn("Este nombre e profesor ya esta registrado");
		
		}else { 
			listProfesores.add(nombre);
			System.out.println("Profesor resgistrado exitosamente");
		}
	
	}

	private void registrarEstudiantes() {
		System.out.prinln("\n<<<< Registro de Estudiantes >>>>");
		for (int i = 0; i <listaProfesores.get(i)); {
			
			JOptionPan.showMessageDialog(null, "Ingrese los Estudiantes" )
			             + "para el profeor"+listaProfesores.get(i));
			             
			             listEstudiantes=new ArrayList<String>();
			             
			             int cant=Integer.parseInt(JOptionPane.showInputDialog("cantidad de Estudiantes"));
			             
			             for (int j =0; <cant ; j++) {
			
			String nombreEstr=JOptionPane.showInputDialog("nombre Estudiante  "+ (j+1));
			listEstudiantes.add(nombreEst);
		}
		
			   if (listaEstudiante.constains(nombre)) {
			      System.out.println("Este nombre de estudiante ya esta registrado.");
			          
	}else {
		listaEstudiante.add(nombre);
		System.out.println("Estudiante registrado exitosamente");
	}
	
	}
	
		
}
