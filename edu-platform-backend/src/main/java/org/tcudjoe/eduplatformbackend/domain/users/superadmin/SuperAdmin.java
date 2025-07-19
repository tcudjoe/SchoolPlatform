package org.tcudjoe.eduplatformbackend.domain.users.superadmin;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.school.School;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseUser;

import java.util.List;

@Entity
@Getter
@Setter
@DiscriminatorValue("SuperAdmin")
@NoArgsConstructor
public class SuperAdmin extends BaseUser {
	private String phonenumber;
	@ManyToMany
	@JoinTable(
			name = "superadmin_managed_schools",
			joinColumns = @JoinColumn(name = "superadmin_id"),
			inverseJoinColumns = @JoinColumn(name = "school_id")
	)
	private List<School> managedSchools;
}
