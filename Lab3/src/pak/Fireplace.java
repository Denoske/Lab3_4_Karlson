package pak;

public class Fireplace extends Create {
    public Fireplace(int age, String name) {
        super(name, age);
        System.out.println("Created object " + name);
    }

    public String toString() {
        return "Picture{" + this.GetName() + '}';
    }
}