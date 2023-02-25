package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class RestRessources {
    @GET
    @Produces("text/plain")
    public String sayHello() {

        return "Hello from JAX-RS";
    }

    @Path("firstName={firstNameValue}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloWithFirstName(@PathParam(value = "firstNameValue") String firstName) {
        if(firstName != null)
            return "Hello from " + firstName;
        return "First Name contain a null value";

    }

    @Path("firstName={firstNameValue}&lastName={lastNameValue}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloWithFirstNameAndLastName(
            @PathParam(value = "firstNameValue") String firstName,
            @PathParam(value = "lastNameValue") String lastName) {
        if(firstName != null && lastName != null)
            return "Hello from "+firstName+" "+lastName;
        return "First Name or Last Name contain a null value";

    }


}