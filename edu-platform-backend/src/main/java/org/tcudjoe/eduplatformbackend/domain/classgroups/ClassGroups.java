package org.tcudjoe.eduplatformbackend.domain.classgroups;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ClassGroups {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
}
