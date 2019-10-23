package com.github.MRekusz.listeners;

import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String first_name;
    private String last_name;
    private String password;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Users users = (Users) o;
        return Objects.equals (id, users.id) &&
                Objects.equals (first_name, users.first_name) &&
                Objects.equals (last_name, users.last_name) &&
                Objects.equals (password, users.password) &&
                Objects.equals (username, users.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash (id, first_name, last_name, password, username);
    }
}
