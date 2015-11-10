/**
 * 
 */

/**
 * @author Kevin
 *A laser that moves through space
 */
public class Laser extends SpaceEntity {

	private double speed;
	/**
	 * Creates a laser
	 */
	public Laser() {
		isAlive = true;
		speed = 50.0; //Play around with this
		// TODO shape, center
	}

	/* (non-Javadoc)
	 * @see SpaceEntity#move()
	 */
	@Override
	void move() {
		// TODO Auto-generated method stub

	}

}
