package cl.desafiolatam.business;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.model.Evento;

public class EventoBusiness {
	 /**
	 * -------------------------------------------------------------------------------------------
	 * Método setea y obtiene los eventos existentes en una lista de objetos de tipo evento
	 * 
	 * @param -
	 * @return List<Evento>
	 * @author: Autor <autor@desafiolatam.com>
	 * @version: 23/08/2022
	 */
		public List<Evento> getEventos() {
			
			// Inicializacion de lista de eventos
			ArrayList<Evento> eventos = new ArrayList<Evento>();
			
			// Info Evento 1
			Evento evento1 = new Evento();
			evento1.setId(1);
			evento1.setNombre("Metallica");
			evento1.setDescripcion("Descripción Uno");
			evento1.setImagen("https://www.freepik.com/free-photo/shining-starling-aplonis-metallica-illustrated-by-elizabeth-gould_3533759.htm#fromView=search&page=1&position=1&uuid=ea0e093a-8440-457c-b047-87c6c8f3e3cc");
			evento1.setPrecio(10000);
			evento1.setLugar("Estadio Nacional");
			evento1.setMapa("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

			
			// Info Evento 2
			Evento evento2 = new Evento();
			evento2.setId(2);
			evento2.setNombre("Fiestas Patrias");
			evento2.setDescripcion("Descripción Dos");
			evento2.setImagen("https://img.freepik.com/vector-gratis/fondoplano-fiestas-patrias-chile_23-2149539845.jpg");
			evento2.setPrecio(20000);
			evento2.setLugar("parque O'higgins");
			evento2.setMapa("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

			// Info Evento 3
			Evento evento3 = new Evento();
			evento3.setId(3);
			evento3.setNombre("Iron Maiden");
			evento3.setDescripcion("Descripción Tres");
			evento3.setImagen("");
			evento3.setPrecio(30000);
			evento3.setLugar("Estadio Monumental");
			evento3.setMapa("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

			// Info Evento 4
			Evento evento4 = new Evento();
			evento4.setId(4);
			evento4.setNombre("Delfín Hasta el Fin!");
			evento4.setDescripcion("Descripción Cuatro");
			evento4.setImagen("../assets/img/delfin-quishpe-corrupcion-ex-cantante-convertido-alcalde-guamote-recibe-pena-de-carcel-por-que-hizo-ok_crop1637338564473.jpeg_242310155.jpeg");
			evento4.setPrecio(40000);
			evento4.setLugar("Centro de Eventos Amanda");
			evento4.setMapa("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");
		
			
			// Agrega Eventos a lista
			eventos.add(evento1);
			eventos.add(evento2);
			eventos.add(evento3);
			eventos.add(evento4);
			
			// Retorno de lista de eventos
			return eventos;
		}
	 
	 /**
	  * --------------------------------------------------------------------------------------------
	  * Método que entrega el objeto evento segun el id de busqueda
	  *
	  * @param Evento evento
	  * @return Evento evento
	  * @author: Autor <autor@desafiolatam.com>
	 * @version: 23/08/2022
	  */
		public Evento getEventobyID(Evento evento) {
			List<Evento> listaEventos = getEventos();
			for (int x = 0; x < listaEventos.size(); x++) {
				if (listaEventos.get(x).getId() == evento.getId()) {
					evento = listaEventos.get(x);
				}
			}
			// Retorno de Evento
			return evento;
		}
	  
	  /**
	   * --------------------------------------------------------------------------------------------
	   * Método retorna el valor a pagar de un evento segun el valor y cantidad de tickets seleccionados
	   *
	   * @param int valorEvento, int cantidadTickets
	   * @return int valor
	   * @author: Autor <autor@desafiolatam.com>
	   * @version: 23/08/2022
	   */
		public int calculaValorCompra(int valorEvento, int cantidadTickets) {
			int valor = valorEvento * cantidadTickets;
			return valor;
		}

}

	  
	  
	  