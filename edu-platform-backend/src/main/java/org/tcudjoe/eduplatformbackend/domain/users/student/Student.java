package org.tcudjoe.eduplatformbackend.domain.users.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.school.School;
import org.tcudjoe.eduplatformbackend.domain.schoolclass.SchoolClass;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseUser;
import org.tcudjoe.eduplatformbackend.domain.shared.interfaces.SchoolScoped;
import org.tcudjoe.eduplatformbackend.domain.subject.Subject;
import org.tcudjoe.eduplatformbackend.domain.users.parent.Parent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Student")
public class Student extends BaseUser implements SchoolScoped {
	@ManyToOne
	@JoinColumn(name = "school_class_id")
	private SchoolClass schoolClass;
	@ManyToMany
	@JoinColumn(name = "student_id")
	private List<Subject> subjects;
	private LocalDateTime dateOfBirth;
	private String address;
	@ManyToOne
	@JoinColumn(name = "parent_contact_id")
	private Parent parentContact;
	private long studentNumber;
	private long gradeLevel;
	private LocalDate enrollmentDate;
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;

	@Override
	public School getSchool() {
		return this.school;
	}
}
