package org.tcudjoe.eduplatformbackend.domain.homework;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.users.student.Student;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class HomeworkSubmission {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@ManyToOne
	@JoinColumn(name = "homework_id")
	private Homework homework;
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	private List<String> fileUrl;
	private LocalDateTime submittedAt;
	@Enumerated(EnumType.STRING)
	private SubmissionStatus status;
	private String feedback;
	@Min(0)
	@Max(100)
	private Integer grade;
	private LocalDateTime gradedAt;
}
