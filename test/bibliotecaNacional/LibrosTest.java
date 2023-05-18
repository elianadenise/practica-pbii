package bibliotecaNacional;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibrosTest {

	@Test
	public void queSePuedaCrearUnLibro() {
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		
		assertNotNull(matematica);
		assertNotNull(geografia);
		assertNotNull(historia);
	}

}
