package com.dnt.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.dnt.view.View;


public class ControllerTest {
	@Test
	public void controlador_imprime_una_sola_vez_la_vista() {
		View mockedView = mock(View.class);	
		
		Controller controller = new Controller(mockedView);
		controller.processRequest();
		
		verify(mockedView, times(1)).render();
	}
}
