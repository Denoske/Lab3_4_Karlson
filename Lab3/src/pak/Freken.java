package pak;

public class Freken extends Create implements IHuman,IFreken {
    public Freken(int age, String name) {
        super(name, age);
        System.out.println("Created person " + name);
    }
	public void see() {
		System.out.println( this.GetName() + " will see a ghost that will frighten anyone " );
	}

}
