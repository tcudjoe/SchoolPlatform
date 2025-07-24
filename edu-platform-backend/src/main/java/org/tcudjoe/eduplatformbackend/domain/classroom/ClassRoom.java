package org.tcudjoe.eduplatformbackend.domain.classroom;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.school.School;
import org.tcudjoe.eduplatformbackend.domain.users.student.Student;
import org.tcudjoe.eduplatformbackend.domain.users.teacher.Teacher;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "class_room", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"school_id", "name"})
})
public class ClassRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "homeroom_teacher_id")
	private Teacher homeroomTeacher;
	@OneToMany(mappedBy = "classRoom", fetch = FetchType.LAZY)
	private List<Student> students;
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;
	private Integer capacity;
}
