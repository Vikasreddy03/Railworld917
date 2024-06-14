package com.jsp.Collections;

import java.util.Comparator;

public class brand implements Comparator<SmartPhone>
{

	@Override
	public int compare(SmartPhone b1, SmartPhone b2) {
		
		return -b1.getBrand().compareTo(b2.getBrand());
	}

}
