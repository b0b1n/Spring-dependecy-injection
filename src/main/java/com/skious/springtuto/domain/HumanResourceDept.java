package com.skious.springtuto.domain;

import com.skious.springtuto.service.RecruitmentService;

public class HumanResourceDept implements Department {
	
	private String deptName;
	private RecruitmentService recruitmentService;
	private Organization organization;
	
	public HumanResourceDept(RecruitmentService recruitmentService, Organization organization) {
		this.recruitmentService = recruitmentService;
		this.organization = organization;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(organization.getCompanyName(),
				deptName, numberOfRecruitments);
		return hiringFacts;
	}

}
