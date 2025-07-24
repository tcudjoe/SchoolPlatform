package org.tcudjoe.eduplatformbackend.domain.users.admin;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.school.School;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseEmployee;
import org.tcudjoe.eduplatformbackend.domain.shared.interfaces.SchoolScoped;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("SchoolAdmin")
public class SchoolAdmin extends BaseEmployee implements SchoolScoped {
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;

	@Override
	public School getSchool() {
		return this.school;
	}
}
