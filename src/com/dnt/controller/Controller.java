package com.dnt.controller;

import com.dnt.view.View;

public class Controller {
	View view;
	
	public Controller(View view) {
		this.view = view;
	}
	
	public void processRequest() {
		this.view.render();
	}
}
