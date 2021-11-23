package org.craftedsw.builders;

import java.util.Date;

import org.jbehave.core.steps.ParameterConverters.DateConverter;

public class DateCreator {
	
	public static Date date(String dateString) {

		DateConverter dateConverter = new DateConverter();

		// Método para convertir, castear o parsear una fecha por medio de un String
		Date date = (Date) dateConverter.convertValue(dateString, Date.class);
		return date;		
	}

}
