package org.tcudjoe.eduplatformbackend.domain.homework;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.tcudjoe.eduplatformbackend.domain.classroom.ClassRoom;
import org.tcudjoe.eduplatformbackend.domain.subject.Subject;
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
	@Column(nullable = false)
	private String title;
	@Column(nullable = false, length = 1000)
	private String description;
	@ManyToOne
	@JoinColumn(name = "assigned_by_id")
	private Teacher assignedBy;
	@ManyToMany
	@JoinTable(
			name = "homework_students",
			joinColumns = @JoinColumn(name = "homework_id"),
			inverseJoinColumns = @JoinColumn(name = "student_id")
	)
	private List<Student> students;
	private LocalDate assignedDate;
	@Column(nullable = false)
	private LocalDate dueDate;
	@Enumerated(EnumType.STRING)
	private HomeworkStatus status;
	@OneToMany(mappedBy = "homework", cascade = CascadeType.ALL)
	private List<HomeworkSubmission> submissions;
	@ManyToOne
	private Subject subject;
	@ManyToOne
	private ClassRoom classRoom;
	@CreatedDate
	private LocalDate createdAt;
	@LastModifiedDate
	private LocalDate updatedAt;
}
