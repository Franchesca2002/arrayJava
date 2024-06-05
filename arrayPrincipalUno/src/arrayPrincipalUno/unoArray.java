package arrayPrincipalUno;

public class unoArray {

	public static void main(String[] args) {
		
		ArrayLista<String> listaProfesores=new ArrayList<>();
		
		listaProfesores.add("Cristian");
		listaProfesores.add("German");
		listaProfesores.add("Hugo");
		
		ArrrayList<String> listEstudiantes;
		
		for (int i = 0; i < listaProfesores.size(); i++) {
			
			JOptionPane.showMesssageDialog(null, "Ingrese los estudiantes"
					+"para el profesor"+listaProfesores.get(i));
			
			listEstudiantes=new Arraylist<String>();
			
			int cant=Integer.parseInt(JOptionPane.showImputDialog("cantidad de estudiantes"));
			
			for (int j = 0, <cant ; j++) {
				
				String nombreEstu=JOptionPane.showInputDialog("nombre estudiante" + (j+1));
				
			}
			System.out.print("Profesor  " +listaProfesores.get(i)+" = ");
			System.out.println(listEstudiantes);
		}
		

	}

}
