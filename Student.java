package org;

import java.util.List;

public class Student {
	private List<String> subjects;

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [subjects=" + subjects + "]";
	}
	

}
