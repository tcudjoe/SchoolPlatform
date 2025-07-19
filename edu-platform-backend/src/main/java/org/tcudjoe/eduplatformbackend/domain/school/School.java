package org.tcudjoe.eduplatformbackend.domain.school;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.tcudjoe.eduplatformbackend.domain.shared.enums.SubscriptionPlanEnum;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "school")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@NotBlank
	private String name;
	private String shortName;
	private String schoolCode;
	private String address;
	private String city;
	private String postalCode;
	private String country;
	@Email
	private String email;
	private String phonenumber;
	private String principalName;
	private String logoUrl;
	private String primaryColor;
	private String secondaryColor;
	private String timeZone;
	private String language;
	private SubscriptionPlanEnum subscriptionPlan;
	private Integer studentCountLimit;
	@Lob
	private String notes;
	@CreatedDate
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	private LocalDateTime activatedAt;
}
