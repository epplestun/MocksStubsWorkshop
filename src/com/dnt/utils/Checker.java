package com.dnt.utils;

import java.security.InvalidParameterException;

public class Checker {
	public static void check(Object info) {
		if(info == null)
			throw new InvalidParameterException("La información no puede ser nula");
	}
}
