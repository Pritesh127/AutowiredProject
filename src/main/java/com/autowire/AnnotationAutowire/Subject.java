package com.autowire.AnnotationAutowire;

import java.util.List;

public class Subject {

	private List<String> subjects;

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Subject [subjects=" + subjects + "]";
	}

	
}
