package org.tcudjoe.eduplatformbackend.domain.teacher;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.course.Subject;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseEmployee;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Teacher")
public class Teacher extends BaseEmployee {
	private List<Subject> subjects;
}
