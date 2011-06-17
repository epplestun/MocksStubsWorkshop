package com.dnt.view;

import com.dnt.template.ITemplate;

public class View {
	ITemplate template;
	
	public View(ITemplate template) {
		this.setTemplate(template);
	}

	public ITemplate getTemplate() {
		return template;
	}

	public void setTemplate(ITemplate template) {
		this.template = template;
	}
	
	public String render() {
		return this.getTemplate().getTemplate();
	}
}
