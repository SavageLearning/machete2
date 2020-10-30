package com.savagelearning.machete.resources;

import com.savagelearning.machete.core.Person;
import com.savagelearning.machete.db.PersonDAO;
import com.savagelearning.machete.views.PersonView;
import io.dropwizard.hibernate.UnitOfWork;
import java.util.OptionalLong;


import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/people/{personId}")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

    private final PersonDAO peopleDAO;

    public PersonResource(PersonDAO peopleDAO) {
        this.peopleDAO = peopleDAO;
    }

    @GET
    // @Operation(value = "Retrieve a user", notes = "Get a user by a user id (guid).")
    // @ApiResponses(value = {
    //         @ApiResponse(code = 200, message = "User found. Success."),
    //         @ApiResponse(code = 404, message = "User not found."),
    //         @ApiResponse(code = 500, message = "Internal Server Error."),
    // })
    @UnitOfWork
    public Person getPerson(@PathParam("personId") OptionalLong personId) {
        return findSafely(personId.getAsLong());
    }

    @GET
    @Path("/view_freemarker")
    @UnitOfWork
    @Produces(MediaType.TEXT_HTML)
    public PersonView getPersonViewFreemarker(@PathParam("personId") OptionalLong personId) {
        return new PersonView(PersonView.Template.FREEMARKER, findSafely(personId.getAsLong()));
    }

    @GET
    @Path("/view_mustache")
    @UnitOfWork
    @Produces(MediaType.TEXT_HTML)
    public PersonView getPersonViewMustache(@PathParam("personId") OptionalLong personId) {
        return new PersonView(PersonView.Template.MUSTACHE, findSafely(personId.getAsLong()));
    }

    private Person findSafely(long personId) {
        return peopleDAO.findById(personId).orElseThrow(() -> new NotFoundException("No such user."));
    }
}
