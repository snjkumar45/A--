package day1;

public class Kisaan {
	private String kisanName;
	private int age;
	private String city;
	public Kisaan(String kisanName, int age, String city) {
		super();
		this.kisanName = kisanName;
		this.age = age;
		this.city = city;
	}
	public Kisaan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Kisaan [kisanName=" + kisanName + ", age=" + age + ", city=" + city + "]";
	}
	public String getKisanName() {
		return kisanName;
	}
	public void setKisanName(String kisanName) {
		this.kisanName = kisanName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
