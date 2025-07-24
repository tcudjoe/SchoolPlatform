package org.tcudjoe.eduplatformbackend.domain.users.schedulemaker;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.schedule.Schedule;
import org.tcudjoe.eduplatformbackend.domain.school.School;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseEmployee;
import org.tcudjoe.eduplatformbackend.domain.shared.interfaces.SchoolScoped;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("ScheduleMaker")
public class ScheduleMaker extends BaseEmployee implements SchoolScoped {
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;
	@OneToMany(mappedBy = "createdBy", cascade = CascadeType.PERSIST)
	private List<Schedule> createdSchedules;


	@Override
	public School getSchool() {
		return this.school;
	}
}
