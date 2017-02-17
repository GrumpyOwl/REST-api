package marta.rest;

import marta.rest.service.XMLParserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private XMLParserService service;

	@Test
	public void contextLoads() throws FileNotFoundException {
		service.parse();

	}

}
