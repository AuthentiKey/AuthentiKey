package de.authentikey.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class User extends PanacheEntity implements Serializable {
    @Id
    private long uuid;
    private String username;
    private String password;

    public User() {

    }

    public static User findById(long id) {
        return find("uuid", id).firstResult();
    }

    public static List<User> findUserAll() {
        return listAll();
    }

    public static void addUser(User user){
        persist(user);
    }

    public static void delete(long id) {
        delete("uuid", id);
    }
}
