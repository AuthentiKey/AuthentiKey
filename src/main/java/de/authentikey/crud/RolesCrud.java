package de.authentikey.crud;

import de.authentikey.entities.Roles;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/role")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RolesCrud {
    @GET
    @Path("/id")
    public void getRoleById(@PathParam("id") long id) {
        Roles.findById(id);
    }

    @POST
    @Path("/add")
    public void addRole(Roles role) {
        Roles.addRole(role);
    }

    @DELETE
    @Path("/id")
    public void deleteRoleById(@PathParam("id") long id) {
        Roles.delete(id);
    }
}
