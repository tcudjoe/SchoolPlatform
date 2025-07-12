package org.tcudjoe.eduplatformbackend.domain.users.parent;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.school.School;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseUser;
import org.tcudjoe.eduplatformbackend.domain.shared.interfaces.SchoolScoped;
import org.tcudjoe.eduplatformbackend.domain.users.student.Student;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Parent")
public class Parent extends BaseUser implements SchoolScoped {
	@OneToMany(mappedBy = "parent")
	private List<Student> children;
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;

	@Override
	public School getSchool() {
		return this.school;
	}
}
