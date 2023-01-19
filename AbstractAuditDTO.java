package com.xworkz.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractAuditDTO {
	private String createdby;
	private LocalDateTime createdat;
	private String updateby;
	private LocalDateTime updateat;

}
