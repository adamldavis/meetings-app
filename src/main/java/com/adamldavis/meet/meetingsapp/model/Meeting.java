package com.adamldavis.meet.meetingsapp.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Meeting {

    @NonNull
    private String name;

    private String description;

    private ZonedDateTime zonedDateTime;

    private String duration;

    private String location;

    @Builder.Default
    private List<Rsvp> rsvps = new ArrayList<>();
}
