package org.primefaces.test;

import java.io.Serializable;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Author implements Serializable {

    private String id;
    private String name;
    private String nationality;
    private Integer yearOfBirth;

    public Author( String name, String nationality, Integer yearOfBirth ) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }
}
