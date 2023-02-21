package aplicacion.servicios;

import java.util.ArrayList;
import java.util.List;

import aplicacion.entidades.Repostaje;
/**
 * Interfaz que define los metodos que dan servicio a la gestion de respostaje
 * @author ivan vazquez
 *
 */
public interface InterfazRepostaje {

	/**
	 * Actualiza la lista con el nuevo repostaje normal
	 * @param listaAntiguaRepostaje lista actual
	 * @return lista actualizada
	 */
	// cabecera /signatura repostaje normal
	public List<Repostaje> addRespostajeNormal(List<Repostaje>listaAntiguaRepostaje);
	
	/**
	 * Actualiza la lista con el nuevo repostaje con factura
	 * @param listaAntiguaRepostaje lista actual
	 * @return lista actualizada
	 */
	// cabecera /signatura repostaje con factura
	public List<Repostaje> addRespostajeFactura(List<Repostaje>listaAntiguaRepostaje);
	
	/**
	 * Imprime por consola el listado de respostaje existente
	 */	
	// cabecera /signatura listado de todoso los repostajes
	public void listarTodosRepostajes();
	
}
