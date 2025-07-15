package org.tcudjoe.eduplatformbackend.domain.users.teacher;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.homework.Homework;
import org.tcudjoe.eduplatformbackend.domain.school.School;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseEmployee;
import org.tcudjoe.eduplatformbackend.domain.shared.interfaces.SchoolScoped;
import org.tcudjoe.eduplatformbackend.domain.subject.Subject;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Teacher")
public class Teacher extends BaseEmployee implements SchoolScoped {
	@ManyToMany
	@JoinColumn(name = "teacher_id")
	private List<Subject> subjects;
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;
	@OneToMany(mappedBy = "assignedBy", cascade = CascadeType.ALL)
	private List<Homework> assignedHomeworks;

	@Override
	public School getSchool() {
		return this.school;
	}
}
