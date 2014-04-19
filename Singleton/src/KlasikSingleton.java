/**
 * 
 * @author M. Sezgin RUHi
 *
 */
public class KlasikSingleton {
	private static KlasikSingleton instance = null;

	protected KlasikSingleton() {
		// kann auch private sein. protected f�r vererbung.
	}

	public static KlasikSingleton getInstance() {
		if (instance == null) {
			instance = new KlasikSingleton();
		}
		return instance;
	}
}
