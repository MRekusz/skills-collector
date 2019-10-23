package com.github.MRekusz.listeners;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "source")
public class Source {


    @ManyToMany
    @JoinTable(name = "source", joinColumns = {@JoinColumn(name = "id")}, inverseJoinColumns = {@JoinColumn(name = "source_id")})
    private Long source_id;
    @Column(unique = true, nullable = false)
    private String description;
    private String name;


    public Long getSource_id() {
        return source_id;
    }

    public void setSource_id(Long source_id) {
        this.source_id = source_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Source source = (Source) o;
        return Objects.equals (source_id, source.source_id) &&
                Objects.equals (description, source.description) &&
                Objects.equals (name, source.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash (source_id, description, name);
    }
}
