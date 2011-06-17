package com.dnt.template;

import static org.junit.Assert.assertEquals;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.dnt.dao.IOrigenDatos;

public class TemplateTest {
	@Test
	public void plantilla_sustituye_un_valor() {
		Map<String, String> info = new HashMap<String, String>();
		info.put("nombre", "Ivan");
		
		ITemplate template = new Template("Mi nombre es {nombre}", info);
		assertEquals("Mi nombre es Ivan", template.getTemplate());
	}

	@Test
	public void plantilla_sustituye_varios_valores() {
		Map<String, String> info = new HashMap<String, String>();
		info.put("nombre", "Ivan");
		info.put("apellido", "Rodriguez");
		
		ITemplate template = new Template("Mi nombre es {nombre} {apellido}", info);
		assertEquals("Mi nombre es Ivan Rodriguez", template.getTemplate());
	}
	
	@Test(expected = InvalidParameterException.class)
	public void plantilla_lanza_excepcion_al_pasar_valor_nulo() {
		ITemplate template = new Template("Mi nombre es {nombre} {apellido}", null);
		template.getTemplate();
	}	
}
