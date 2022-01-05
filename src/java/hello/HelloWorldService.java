package hello;

import hello.model.Student;
import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

// The Java class will be hosted at the URI path "/helloworld"

@Path("/helloworld")
public class HelloWorldService {
    
    // The Java method will process HTTP GET requests

    @GET
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some content
        return "Hello World for Web Services!";
    }
    
    @GET
    @Path("json")
    @Produces({ "application/json" })
    public JsonObject getHelloWorldJSON() {	
    	JsonObject record = Json.createObjectBuilder()
        .add("message", createHelloMessage("World from Json!"))
        .build();
        
    	return record;
    }  
    
    
    public static Student TEST_STUDENT = new Student("John", "Wilson", "Ealing, London"); 
    
    @GET
    @Path("student")
    @Produces({ "application/json" })    
    public JsonObject getStudent(){
        Student student =  TEST_STUDENT;
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("firstname", student.getFirstname());
        builder.add("lastname", student.getLastname());
        builder.add("address", student.getAddress());
        return builder.build();
    }
    
    
    
    


    private String createHelloMessage(String name) {
        return "Hello " + name + "!";
    }   
    
}
