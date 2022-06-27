package pak;

public class Karlson extends Create implements IKarlson,IHuman {
	boolean isKarlosPleasure;
	
	public Karlson(int age, String name){
        super(name, age);
        System.out.println("Created person " + name);
    }

	
	private class Propeller {
		private String id;
		public void StartPropeller() {
			System.out.println("((Propeller is " + id +"))");
			
	}
		public Propeller() {
			this.id= "On";
		}
	}
	public void start() {
		 Propeller propeller = new Propeller();
		 propeller.StartPropeller();
		 
		 System.out.println("((" + this.GetName() + " Ready to fly))");
	}



    public void fly(String place) {
    	System.out.println(this.GetName()  + " flew around the " + Place.name);
    	//Counter.FlyAroundTheRoom();
    
    	}
    public void forgot(Things things) {
    	System.out.println(this.GetName() + " and forgot to think about his " + things );
    }
    public void print() {
    	System.out.println("But " + this.GetName() + " drew a small red animal, more lika a fox ");
    	throw new EndOfText();
    }
    public void KarlosPleasure() {
    	System.out.println("Karlson is pleasure!");
    	this.isKarlosPleasure = true;
    }

    public void cackle() throws KarlosPleasure {
    	if ( isKarlosPleasure == true ) {
            System.out.println(this.GetName() + " cackled " );
        
    	}
    	else {
    		throw new KarlosPleasure(this.GetName() + " did not cackle");
    }
    }
    public String toString() {
        return "Karlson{" + this.GetName() + '}';
    }

    public class Counter{ //static class
    	
    	private static int count;
    	
    	public static class FlyAroundTheRoom {
    		 void polet() {
    			count++;
    			System.out.println("<<Karlson circled the room " + count + " times>>");
    	}
    }
    }


	@Override
	public void dress(Things things) {
		System.out.println(this.GetName() + " try on new " + things );
	}
    
	
	
	
	
	
	
    
}