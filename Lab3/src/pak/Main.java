package pak;

import pak.Karlson.Counter;

public class Main {
    public static void main(String[] args) {
        Location location = new Location(0, 0);
        Place place = new Place("Room", location);
        Boy Boy = new Boy(12, "Kid");
        Karlson karlson = new Karlson(7,"Karlson");
        Freken freken = new Freken(74,"Freken");
        Fireplace fireplace = new Fireplace(105, "Fireplace");
        Picture picture = new Picture(0, "Picture");
       
        place.addPerson(Boy);
        place.addPerson(karlson);
        place.addObject(fireplace);
        place.addObject(picture);
        
        Boy.made(Things.clothes);
        Boy.think();
        Counter.FlyAroundTheRoom next = new Counter.FlyAroundTheRoom(); //static nested class
        karlson.dress(Things.clothes);
        karlson.KarlosPleasure();
        karlson.start();//private (non-static) nested class
        
        IKarlson ikarlson = new IKarlson() { //anon class
        	public void dress(Things things) {}
			public void fly(String place) {
		    	System.out.println("Karlson made a few circles around the " + Place.name + " so that the " + Boy.GetName() + " could appreciate his suit");
		    	next.polet();
		    	next.polet();     
	    	}
			public void print() {}
			public void cackle() throws KarlosPleasure {}
			public void forgot(Things things) {} 
			};
        		
        ikarlson.fly(Place.name);
        

        Boy.shuddered(); // Local class

        
        freken.see();
        
        
        //karlson.start();
        karlson.fly(Place.name);
        next.polet();
        try { //checked
        	karlson.cackle();
        } catch (KarlosPleasure e) {
        	System.out.println(e.getMessage());
        	System.out.println(" Karlos with Pleasure? " + karlson.isKarlosPleasure );
        }
        karlson.forgot(Things.picture);
        Boy.walk(Things.fireplace);
        Boy.see(Things.picture);
        Boy.read(Things.picture);
        Picture.inscription(); 
        karlson.print(); //unchecked Karlson.java:41
    }
}