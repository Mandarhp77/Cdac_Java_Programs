package Two_question1;

import java.util.Objects;

class Student implements Comparable <Student>{
	private int id;
	private String name,city;
	private int percentage;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}
	public Student(int id, String name, String city, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name)
				&& percentage == other.percentage;
	}
	@Override
	public int compareTo(Student o) {
		
		return (this.percentage) - (o.percentage);
	}
	

}
