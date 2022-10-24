package org.acme.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Costumer {

    // TODO: REMOVE NOTATIONS AND DEPENDENCIES FROM DOMAIN
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String lastName;
    private String email;
    private Integer age;
}
