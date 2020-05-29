package voru.snake;

/**
 * @author voruti
 *
 */
public interface IGui {

	/**
	 * Legt die Größe des Spielfeldes fest.
	 * 
	 * @param hoehe  die gewünschte Höhe
	 * @param breite die gewünschte Breite
	 */
	void setzeGroesse(int hoehe, int breite);

	/**
	 * Füllt das entsprechende Spielfeld mit dem Text {@code str}.
	 * 
	 * @param x
	 * @param y
	 * @param str
	 * @return den vorherigen Wert dieses Spielfeldes
	 */
	String setzeFeldAuf(int x, int y, String str);

	/**
	 * Fragt das entsprechende Spielfeld ab und gibt es zurück.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	String abfrageFeld(int x, int y);
}
