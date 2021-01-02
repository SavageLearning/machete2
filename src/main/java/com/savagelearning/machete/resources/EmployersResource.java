// package com.savagelearning.machete.resources;

// import io.dropwizard.hibernate.UnitOfWork;
// import com.savagelearning.jooq.Tables;
// import com.savagelearning.jooq.tables.daos.EmployersDao;
// import com.savagelearning.jooq.tables.pojos.Employers;
// import com.savagelearning.jooq.tables.records.EmployersRecord;

// import org.jooq.DSLContext;

// import javax.validation.Valid;
// import javax.ws.rs.GET;
// import javax.ws.rs.POST;
// import javax.ws.rs.Path;
// import javax.ws.rs.Produces;
// import javax.ws.rs.core.Context;
// import javax.ws.rs.core.MediaType;

// @Path("/employers")
// @Produces(MediaType.APPLICATION_JSON)
// public class EmployersResource {

//     private final EmployersDao employersDAO;

//     public EmployersResource(EmployersDao employersDAO) {
//         this.employersDAO = employersDAO;
//     }

//     @POST
//     @UnitOfWork
//     public void createPerson(@Valid Employers employer) {
//         employersDAO.insert(employer);
//     }

//     @GET
//     @UnitOfWork
//     public EmployersRecord listPeople(@Context DSLContext database) {
//         return database.selectFrom(Tables.EMPLOYERS).fetchOne();
//     }
// }
