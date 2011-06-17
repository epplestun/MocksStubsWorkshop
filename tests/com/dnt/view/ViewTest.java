package com.dnt.view;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.dnt.template.ITemplate;
import com.dnt.template.Template;

public class ViewTest {
	@Test
	public void vista_imprime_plantilla() {
		ITemplate mockedTemplate = mock(ITemplate.class);
		when(mockedTemplate.getTemplate()).thenReturn("Mi nombre es Ivan");
		
		View view = new View(mockedTemplate);
		assertEquals("Mi nombre es Ivan", view.render());
	}
	
	@Test
	public void vista_imprime_plantilla_real() {
		Map<String, String> info = new HashMap<String, String>();
		info.put("nombre", "Ivan");
		Template template = new Template("Mi nombre es {nombre}", info);
		
		View view = new View(template);
		assertEquals("Mi nombre es Ivan", view.render());
	}
}
