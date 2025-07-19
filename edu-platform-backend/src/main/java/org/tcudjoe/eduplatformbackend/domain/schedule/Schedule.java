package org.tcudjoe.eduplatformbackend.domain.schedule;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.school.School;
import org.tcudjoe.eduplatformbackend.domain.schoolclass.SchoolClass;
import org.tcudjoe.eduplatformbackend.domain.shared.interfaces.SchoolScoped;
import org.tcudjoe.eduplatformbackend.domain.subject.Subject;
import org.tcudjoe.eduplatformbackend.domain.users.schedulemaker.ScheduleMaker;
import org.tcudjoe.eduplatformbackend.domain.users.teacher.Teacher;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Schedule implements SchoolScoped {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;

	@ManyToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;

	@ManyToOne
	@JoinColumn(name = "school_class_id")
	private SchoolClass schoolClass;

	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;

	@ManyToOne
	@JoinColumn(name = "created_by_id")
	private ScheduleMaker createdBy;

	private DayOfWeek dayOfWeek;

	private LocalTime startTime;
	private LocalTime endTime;

	private String location; // Optional: like a room number

	@Override
	public School getSchool() {
		return this.school;
	}
}
