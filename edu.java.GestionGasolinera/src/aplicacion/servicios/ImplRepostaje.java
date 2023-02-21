package aplicacion.servicios;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Repostaje;
/**
 * Implementacion de la interfaz repostaje
 * @author ivan vazquez
 *
 */
public class ImplRepostaje implements InterfazRepostaje {

	@Override
	public List<Repostaje> addRespostajeNormal(List<Repostaje> listaAntiguaRepostaje) {
		Repostaje repostaje = new Repostaje(); //tiene los valores de la clase Repostaje
		Scanner valores= new Scanner (System.in);
		System.out.println("Introduzca los litros repostados: ");
		repostaje.setLitros(valores.nextDouble());
		System.out.println("Introduzca el importe total: ");
		repostaje.setImporte(valores.nextDouble());
		System.out.println("Introduzca la fecha del repostaje en formato YYYY-MM-dd hh:mm:ss : ");
		repostaje.setFecha(valores.next());
		repostaje.setId(calculoNuevoId(listaAntiguaRepostaje));
		listaAntiguaRepostaje.add(repostaje);
		return listaAntiguaRepostaje;
	}
	
	/**
	 * Calcula el id del nuevo repostaje
	 * @param listaRepostajes lista de repostajes
	 * @return id de un nuevo repostaje
	 */
	private int calculoNuevoId(List<Repostaje>listaRepostajes) {
		int auxiliar=0;
		for (int i = 0; i < listaRepostajes.size(); i++) {			
			int j=listaRepostajes.get(i).getId();
			if (auxiliar < j)
				auxiliar=j;
		}
		
		return auxiliar+1;
	}


	@Override
	public List<Repostaje> addRespostajeFactura(List<Repostaje> listaAntiguaRepostaje) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listarTodosRepostajes() {
		// TODO Auto-generated method stub
		
	}

		
}
