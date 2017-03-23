
public class DropTableArmadillo extends Animal implements Walking{

	public DropTableArmadillo() {
		super("DROP TABLE animals; Armadillo", "Don't let him near your SQL databases");
	}
	
	public DropTableArmadillo(String name, String desc)
	{
		super(name,desc);
	}

	@Override
	public String walk() {
		return "The armadillo walks towards your SQL databases";
	}

	@Override
	public String eat() {
		return "The armadillo consumes the souls of all those who fail to follow SQL best practices";
	}

	@Override
	public String play() {
		return "The armadillo leaves a path of terror and lost data in its path";
	}
	@Override
	public String makeNoise() {
		return "RRRRRRRRRRR sanitize your database inputs RRRRRRRRRRR";
	}
}
