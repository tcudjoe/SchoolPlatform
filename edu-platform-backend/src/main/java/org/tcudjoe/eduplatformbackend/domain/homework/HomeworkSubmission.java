package org.tcudjoe.eduplatformbackend.domain.homework;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.users.student.Student;

import java.time.LocalDateTime;
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
	private Homework homework;
	@ManyToOne
	private Student student;
	private String fileUrl;
	private LocalDateTime submittedAt;
	@Enumerated(EnumType.STRING)
	private SubmissionStatus status;
	private String feedback;
	private Integer grade;
}
