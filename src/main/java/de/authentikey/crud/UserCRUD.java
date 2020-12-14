package de.authentikey.crud;

import de.authentikey.entities.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserCRUD {
    @GET
    public void getUserAll() {
        List<User> userList = User.findUserAll();
    }

    @GET
    @Path("/id")
    public void getUserById(@PathParam("id") long id) {
        User user = User.findById(id);
    }

    @POST
    @Path("/add")
    public void addUser(User user) {
        User.addUser(user);
    }

    @DELETE
    @Path("/delete/id")
    public void deleteUserById(@PathParam("id") long id) {
        User.delete(id);
    }
}
