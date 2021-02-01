package json.Day11.json;

public class Student{
	private String name;
	private Integer age;
	private String cardID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCardID() {
		return cardID;
	}
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}
	public Student(String name, Integer age, String cardID) {
		this.name = name;
		this.age = age;
		this.cardID = cardID;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cardID=" + cardID + "]";
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}