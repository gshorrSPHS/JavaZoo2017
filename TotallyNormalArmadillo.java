public class TotallyNormalArmadillo extends DropTableArmadillo implements Walking{
	public TotallyNormalArmadillo() {
		super("A totally normal armadillo", "A totally normal armadillo");
	}
	@Override
	public String walk() {
		return "The armadillo walks towards you in a not at all unnerving fashion";
	}

	@Override
	public String eat() {
		return "The armadillo eats normal food" + "\nwhich is not the flesh of the last human unfortunate enough" + "\n to come into its grasp.";
	}

	@Override
	public String play() {
		return "The armadillo plays with something which does not" + "\n in any way resemble a severed human arm.";
	}
	@Override
	public String makeNoise() {
		return "The armadillo makes a completely non-lethal noise which" + "\n is not the cry of the millions of tortured souls who have" + "\n fallen to him.";
	}
}
