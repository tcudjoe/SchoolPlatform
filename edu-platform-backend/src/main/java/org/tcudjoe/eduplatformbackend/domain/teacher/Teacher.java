package org.tcudjoe.eduplatformbackend.domain.teacher;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseEmployee;
import org.tcudjoe.eduplatformbackend.domain.subject.Subject;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Teacher")
public class Teacher extends BaseEmployee {
	@ManyToMany
	@JoinColumn(name = "teacher_id")
	private List<Subject> subjects;
}
