package org.tcudjoe.eduplatformbackend.domain.homework;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.users.student.Student;
import org.tcudjoe.eduplatformbackend.domain.users.teacher.Teacher;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Homework {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String title;
	private String description;
	@ManyToOne
	@JoinColumn(name = "assigned_by_id")
	private Teacher assignedBy;
	@ManyToMany
	private List<Student> students;
	private LocalDate assignedDate;
	private LocalDate dueDate;
	@Enumerated(EnumType.STRING)
	private HomeworkStatus status;
	@OneToMany(mappedBy = "homework", cascade = CascadeType.ALL)
	private List<HomeworkSubmission> submissions;
}
