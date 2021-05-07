package com.savagelearning.machete.resources;
import com.savagelearning.jooq.tables.daos.EmployersDao;
import com.savagelearning.jooq.tables.pojos.Employers;
import com.savagelearning.jooq.tables.records.EmployersRecord;

import org.jooq.Configuration;
import org.jooq.DSLContext;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import static com.savagelearning.jooq.Tables.EMPLOYERS;

@Path("/employers")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class EmployersResource {

    public final EmployersDao employersDAO;

    public EmployersResource(Configuration jooqConfiguration) {
        this.employersDAO = new EmployersDao(jooqConfiguration);
    }

     @POST
     public void createPersonWithDAO(@NotNull @Valid Employers e) {
        // https://www.javaer101.com/en/article/15816514.html
        // may need to create a converter https://www.jooq.org/doc/latest/manual/code-generation/custom-data-type-bindings/
        this.employersDAO.insert(e);
     }

    @GET
    public long listEmployers(@Context DSLContext database) {
        return this.employersDAO.findAll().size();
    }
}
