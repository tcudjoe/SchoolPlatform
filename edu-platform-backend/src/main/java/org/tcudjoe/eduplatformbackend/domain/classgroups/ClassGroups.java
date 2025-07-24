package org.tcudjoe.eduplatformbackend.domain.classgroups;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.classroom.ClassRoom;
import org.tcudjoe.eduplatformbackend.domain.school.School;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ClassGroups {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String code;  // e.g. "ha3c"\
	private String educationTrack;  // e.g. "havo", "vwo", optional
	private Integer year; // e.g. 3 for 3rd year
	private Character classLetter; // e.g. 'c'
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;
	@OneToMany
	@JoinColumn(name = "class_group_id")
	private List<ClassRoom> classRooms;
}
