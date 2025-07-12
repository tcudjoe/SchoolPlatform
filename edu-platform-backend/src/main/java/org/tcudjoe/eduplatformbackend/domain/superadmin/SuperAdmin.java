package org.tcudjoe.eduplatformbackend.domain.superadmin;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
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
	private List<School> managedSchools;
}
