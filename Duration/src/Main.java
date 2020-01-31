
public class Main {

	public static void main(String[] args) throws BadBadValueException {
		new TimeDuration(0).toString();
		new TimeDuration(732).toString();
		new TimeDuration(7242).toString();
		new TimeDuration(-10).toString();
		new TimeDuration(-10000).toString();
	}

}
