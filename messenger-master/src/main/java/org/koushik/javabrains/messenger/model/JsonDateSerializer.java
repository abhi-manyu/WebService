package org.koushik.javabrains.messenger.model;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonDateSerializer extends JsonSerializer<Date>
{

	private static final SimpleDateFormat datefmt=
			  new SimpleDateFormat("dd-MM-yyyy");
	public void serialize (Date date, JsonGenerator gen, SerializerProvider provider)
			throws IOException, JsonProcessingException
	{
		 String formated_date=datefmt.format(date);
		 gen.writeString(formated_date);
	}

	
}
