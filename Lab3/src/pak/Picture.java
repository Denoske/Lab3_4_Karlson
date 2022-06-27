package pak;

public class Picture extends Create {
    public Picture(int age, String name) {
        super(name, age);
        System.out.println("Created object " + name);
    }
    
    static void inscription() {
    	System.out.println("'PoRtrET oF My rAbBit'");
    	
    }
    public String toString() {
        return "Picture{" + this.GetName() + '}';
    }
}