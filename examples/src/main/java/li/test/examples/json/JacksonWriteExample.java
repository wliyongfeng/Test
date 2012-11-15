package li.test.examples.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonWriteExample {
    public static void main(String[] args) {

        User user = new User();
        user.setAge(29);
        user.setName("li");
        List<String> msgs = new ArrayList<String>();
        msgs.add("hello");
        msgs.add("world");
        user.setMessages(msgs);
        ObjectMapper mapper = new ObjectMapper();

        try {

            // convert user object to json string, and save to a file
            mapper.writeValue(new File("c:\\user.json"), user);

            // display to console
            System.out.println(mapper.writeValueAsString(user));

        } catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
