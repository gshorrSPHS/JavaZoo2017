
public abstract class Animal {
	private String name,desc;
	public Animal(String name, String desc)
	{
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public abstract String eat();
	public abstract String play();
	public abstract String makeNoise();
}
