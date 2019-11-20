package com.adamldavis.meet.meetingsapp;

import com.adamldavis.meet.meetingsapp.model.Group;
import com.adamldavis.meet.meetingsapp.model.Meeting;
import com.adamldavis.meet.meetingsapp.model.Person;
import com.adamldavis.meet.meetingsapp.model.Rsvp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class MeetingsAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void modelExists() {
		new Group().getMeetings().add(Meeting.builder().name("My Meeting").build());
		new Person();
		new Rsvp("user", UUID.randomUUID(), "yes");
	}

}
