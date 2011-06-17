package com.dnt.template;

import java.util.Map;

import com.dnt.utils.Checker;

public class Template implements ITemplate {
	String template;
	
	public Template(String template, Map<String, String> info) {
		this.template = replace(template, info);
	}
	
	/* (non-Javadoc)
	 * @see com.dnt.template.ITemplate#getTemplate()
	 */
	@Override
	public String getTemplate() {
		return this.template;
	}
	
	public String replace(String template, Map<String, String> info) {
		Checker.check(info);
			
		String output = template;
		
		Object[] values = info.values().toArray();
		Object[] keys = info.keySet().toArray();
		
		if(keys.length == values.length) {
			for(int i = 0, l = values.length; i < l; i++) {
				String key = keys[i].toString();
				String value = values[i].toString();
				
				output = output.replace('{' + key + '}', value);
			}
		}
		
		return output;
	}
}
