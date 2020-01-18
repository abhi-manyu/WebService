package org.Chat.example.beans;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

//@Component
public class JsonDateSerializer extends JsonSerializer<Date>
{

	private static final SimpleDateFormat datefmt=
			  new SimpleDateFormat("dd-MM-yyyy");
	@Override
	public void serialize (Date date, JsonGenerator gen, SerializerProvider provider)
			throws IOException, JsonProcessingException
	{
		 String formated_date=datefmt.format(date);
		 gen.writeString(formated_date);
	}

	
}
