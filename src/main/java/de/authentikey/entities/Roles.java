package de.authentikey.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class Roles extends PanacheEntity implements Serializable {
    @Id
    private long roleId;
    private String role;

    public Roles() {
        
    }

    public static Roles findById(long id) {
        return find("roleId", id).firstResult();
    }

    public static void addRole(Roles role){
        persist(role);
    }

    public static void delete(long id) {
        delete("roleId", id);
    }
}
