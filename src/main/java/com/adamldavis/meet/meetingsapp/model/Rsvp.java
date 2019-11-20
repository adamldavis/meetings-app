package com.adamldavis.meet.meetingsapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Rsvp {

    @NonNull private String username;
    @NonNull private UUID personId;
    @NonNull private String response;

}
