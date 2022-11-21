package com.tcs.www.beans.classes;

public class Project {

	private Integer serialNumber;
	private String projectName;
	private String clientName;
	private Integer teamSize;

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Project [serialNumber=" + serialNumber + ", projectName=" + projectName + ", clientName=" + clientName
				+ ", teamSize=" + teamSize + "]";
	}

}
