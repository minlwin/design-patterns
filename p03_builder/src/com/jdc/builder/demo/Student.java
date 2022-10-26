package com.jdc.builder.demo;

public class Student {

	private int id;
	private String name;
	private String phone;
	private String email;
	private String remark;
	private String grade;

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private int id;
		private String name;
		private String phone;
		private String email;
		private String remark;
		private String grade;

		private Builder() {
		}

		public Student build() {
			return new Student(id, name, phone, email, remark, grade);
		}

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder remark(String remark) {
			this.remark = remark;
			return this;
		}

		public Builder grade(String grade) {
			this.grade = grade;
			return this;
		}
	}

	private Student(int id, String name, String phone, String email, String remark, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.remark = remark;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", remark=" + remark
				+ ", grade=" + grade + "]";
	}

}
