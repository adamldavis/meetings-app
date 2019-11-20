package com.adamldavis.meet.meetingsapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Person {

    @Id
    private UUID id;

    @NonNull
    private String name;

    @Indexed
    @NonNull
    private String username;

    @Indexed
    @NonNull
    private String emailAddress;

}
