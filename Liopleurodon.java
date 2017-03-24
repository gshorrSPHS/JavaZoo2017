
public class Liopleurodon extends Animal implements Swimming, Flying {
	private String nameOfBeast;

	public Liopleurodon(String nameOfBeast) {
		super("Liopleurodon", "The alpha predator of the jurassic, can even eat a T-Rex according to Jurassic Park");
		this.nameOfBeast = nameOfBeast;
		
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return nameOfBeast + " majestically jumps out of the water 30 feet into the air and eats anything in its way";
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return nameOfBeast + " swims at extremely high speeds across the ocean";
	}
	
	@Override
	public String eat(){
		return nameOfBeast + " smells the nearest animal and comes from the shadows and vanquishes it into its stomach";
	}

	@Override
	public String play() {
		
		return nameOfBeast + " splashes an immense wave of water on everyone";
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "...............MKPSMKPCMKPCMKONCKPNMIOKNIONCIONCIONCOI";
	}

}
