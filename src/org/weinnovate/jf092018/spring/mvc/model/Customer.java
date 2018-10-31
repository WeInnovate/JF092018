package org.weinnovate.jf092018.spring.mvc.model;

public class Customer {

	private String name = "Prateek";
	
	private int age;
	
	private String gender;

	private String country;
	
	private String[] courses;
	
	private boolean areYouExperienced;
	
	private String comment;
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isAreYouExperienced() {
		return areYouExperienced;
	}

	public void setAreYouExperienced(boolean areYouExperienced) {
		this.areYouExperienced = areYouExperienced;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
}
