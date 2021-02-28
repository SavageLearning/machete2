package com.savagelearning.machete.resources;
import com.savagelearning.jooq.tables.Employers;
import com.savagelearning.jooq.tables.daos.EmployersDao;
import com.savagelearning.jooq.tables.records.EmployersRecord;

import org.jooq.DSLContext;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import static com.savagelearning.jooq.Tables.EMPLOYERS;

@Path("/employers")
@Produces(MediaType.APPLICATION_JSON)
public class EmployersResource {

    public final EmployersDao employersDAO;

    public EmployersResource(EmployersDao employersDAO) {
        this.employersDAO = employersDAO;
    }

    // @POST
    // public void createPerson(@Valid Employers employer) {
    //     employersDAO.insert(employer);
    // }

    @GET
    public long listEmployers() {
        return employersDAO.count();

    }
}
