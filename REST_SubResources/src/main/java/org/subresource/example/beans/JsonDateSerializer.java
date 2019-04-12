package org.subresource.example.beans;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.springframework.stereotype.Component;

@Component
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
