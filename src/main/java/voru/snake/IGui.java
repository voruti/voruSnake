package voru.snake;

/**
 * @author voruti
 *
 */
public interface IGui {

	/**
	 * Legt die Gr��e des Spielfeldes fest.
	 * 
	 * @param hoehe  die gew�nschte H�he
	 * @param breite die gew�nschte Breite
	 */
	void setzeGroesse(int hoehe, int breite);

	/**
	 * F�llt das entsprechende Spielfeld mit dem Text {@code str}.
	 * 
	 * @param x
	 * @param y
	 * @param str
	 * @return den vorherigen Wert dieses Spielfeldes
	 */
	String setzeFeldAuf(int x, int y, String str);

	/**
	 * Fragt das entsprechende Spielfeld ab und gibt es zur�ck.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	String abfrageFeld(int x, int y);
}
