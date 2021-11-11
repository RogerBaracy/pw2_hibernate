package model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Channel extends PanacheEntity {

    private String hash;

    @ManyToMany(mappedBy = "channels", fetch = FetchType.EAGER)
    private List<User> users;

    public Channel() {
        this.users = new ArrayList<>();
    }

    public String getHash(){
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    
}
