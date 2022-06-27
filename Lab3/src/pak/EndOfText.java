package pak;

public class EndOfText extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EndOfText(){
        System.err.println("To be continued...");
    }
}