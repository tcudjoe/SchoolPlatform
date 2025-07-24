package org.tcudjoe.eduplatformbackend.domain.users.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.classroom.ClassRoom;
import org.tcudjoe.eduplatformbackend.domain.homework.HomeworkSubmission;
import org.tcudjoe.eduplatformbackend.domain.school.School;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseUser;
import org.tcudjoe.eduplatformbackend.domain.shared.interfaces.SchoolScoped;
import org.tcudjoe.eduplatformbackend.domain.subject.Subject;
import org.tcudjoe.eduplatformbackend.domain.users.parent.Parent;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Student")
public class Student extends BaseUser implements SchoolScoped {
	@ManyToOne
	@JoinColumn(name = "school_class_id")
	private ClassRoom classRoom;
	@ManyToMany
	@JoinTable(
			name = "student_subject",
			joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "subject_id")
	)
	private List<Subject> subjects;
	private LocalDate dateOfBirth;
	private String address;
	@ManyToOne
	@JoinColumn(name = "parent_contact_id")
	private Parent parentContact;
	private long studentNumber;
	private Integer gradeLevel;
	private LocalDate enrollmentDate;
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<HomeworkSubmission> submissions;

	@Override
	public School getSchool() {
		return this.school;
	}

	public boolean isEnrolled() {
		return enrollmentDate != null;
	}

}
