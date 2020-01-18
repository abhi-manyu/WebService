package org.Chat.example.beans;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class JsonDateDeserializer extends JsonDeserializer<Date>
{
    @Override
    public Date deserialize(JsonParser jsonParser,
            DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String date = jsonParser.getText();
        
        try {
			return format.parse(date);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

    }

}