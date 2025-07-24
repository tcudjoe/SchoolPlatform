package org.tcudjoe.eduplatformbackend.domain.subject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.users.student.Student;
import org.tcudjoe.eduplatformbackend.domain.users.teacher.Teacher;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String name;
	private String description;
	@ManyToMany(mappedBy = "subjects")
	private List<Teacher> teachers;
	@ManyToMany(mappedBy = "subjects")
	private List<Student> students;
}
