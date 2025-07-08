package org.tcudjoe.eduplatformbackend.domain.parent;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseUser;
import org.tcudjoe.eduplatformbackend.domain.student.Student;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Parent")
public class Parent extends BaseUser {
	@OneToMany(mappedBy = "parent")
	private List<Student> children;
}
