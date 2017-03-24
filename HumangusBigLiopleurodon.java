
public class HumangusBigLiopleurodon extends Liopleurodon {
private int lengthInMeters;
private int bigFishEaten = 0;
private String nameOfBeast;
public HumangusBigLiopleurodon (String nameOfBeast){
	super(nameOfBeast);
	this.nameOfBeast = nameOfBeast;
}
@Override
public String fly() {
	// TODO Auto-generated method stub
	return nameOfBeast + " majestically jumps out of the water 30 miles into the air and disappears into the sky before eating anything below it";
}

@Override
public String swim() {
	// TODO Auto-generated method stub
	return nameOfBeast + " swims at super sonic speed across the ocean";
}

@Override
public String eat(){
	bigFishEaten++;
	System.out.println(bigFishEaten + " big fish have been eaten");
	return nameOfBeast + " smells the nearest animal and comes from the shadows and vanquishes it into its stomach";
	
}

@Override
public String play() {
	
	return nameOfBeast + " splashes an immense wave that floods the whole city";
}
}
