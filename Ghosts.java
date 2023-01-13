package com.xworkz.autowired;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ghosts {
	@Autowired
	@Qualifier("ghostName")
	private String name;
	@Autowired
	@Qualifier("ghostGender")
	private String gender;
	@Autowired
	@Qualifier("ghostAge")
	private int age;
	@Autowired
	@Qualifier("ghostNailLength")
	private double nailLength;
	@Autowired
	@Qualifier("ghostHeight")
	private double height;
	@Autowired
	@Qualifier("ghostMotherName")
	private String motherName;
	@Autowired
	@Qualifier("ghostFatherName")
	private String fatherName;
	@Autowired
	@Qualifier("ghostTypeOfDeath")
	private String typeOfDeath;
	@Autowired
	@Qualifier("ghostDressCode")
	private String dressCode;
	@Autowired
	@Qualifier("ghostDateOfDeath")
	private LocalDate dateOfDeath;
	private long aadharNo;
	private String panNo;
	private long voterIdNo;
	private boolean graduated;
	private String religion;
	private String instagramId;
	private String snapchatId;
	private long phNo;
	private boolean married;
	private boolean BPLCard;

	@Autowired
	public Ghosts(@Qualifier("ghostAadharNo") long aadharNo, @Qualifier("ghostPanNo") String panNo,
			@Qualifier("ghostVoterIdNo") long voterIdNo, @Qualifier("ghostIsGraduated") boolean graduated,
			@Qualifier("ghostReligion") String religion, @Qualifier("ghostInstagramId") String instagramId,
			@Qualifier("ghostSnapId") String snapchatId, @Qualifier("ghostPhNo") long phNo,
			@Qualifier("ghostIsMarried") boolean married, @Qualifier("ghostBPL") boolean BPLCard) {
		super();
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.voterIdNo = voterIdNo;
		this.graduated = graduated;
		this.religion = religion;
		this.instagramId = instagramId;
		this.snapchatId = snapchatId;
		this.phNo = phNo;
		this.married = married;
		this.BPLCard = BPLCard;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", age=" + age + ", nailLength=" + nailLength
				+ ", height=" + height + ", motherName=" + motherName + ", fatherName=" + fatherName + ", typeOfDeath="
				+ typeOfDeath + ", dressCode=" + dressCode + ", dateOfDeath=" + dateOfDeath + ", aadharNo=" + aadharNo
				+ ", panNo=" + panNo + ", voterIdNo=" + voterIdNo + ", graduated=" + graduated + ", religion="
				+ religion + ", instagramId=" + instagramId + ", snapchatId=" + snapchatId + ", phNo=" + phNo
				+ ", married=" + married + ", BPLCard=" + BPLCard + "]";
	}

}
