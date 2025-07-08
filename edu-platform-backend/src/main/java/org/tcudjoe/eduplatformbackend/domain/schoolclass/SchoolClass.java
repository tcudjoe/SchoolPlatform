package org.tcudjoe.eduplatformbackend.domain.schoolclass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.student.Student;
import org.tcudjoe.eduplatformbackend.domain.teacher.Teacher;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SchoolClass {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "homeroom_teacher_id")
	private Teacher homeroomTeacher;
	@OneToMany(mappedBy = "schoolClass")
	private List<Student> students;
}
