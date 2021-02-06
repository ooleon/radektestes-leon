package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RadektestesLeonApplicationTests {

private static final Logger log = LoggerFactory.getLogger(RadektestesLeonApplication.class);

	@BeforeEach
	public void contextLoads() {
	}

//	@Test
	public void fooBaa() {
		System.out.println("proba FooBaa");
		FooBaa testFooBaa = new FooBaa();
		testFooBaa.acendente();
	}
	
	
	@Test
	public void calcularString() {
		
		CalcularString.ss="a";
		assertEquals(CalcularString.ss.length(), CalcularString.calcular());
		log.info("proba nº6 CalcularString");
		
	}
	


}
