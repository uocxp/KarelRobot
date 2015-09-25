/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CollectNewspaper extends Karel {

	public void run() {
		moveBlocked();
		goHigh();
		goLow();

	}

	public void turnRight() {
		for (int i = 0; i < 3; i++) {
			turnLeft();
		}
	}

	public void moveBlocked() {

		if (frontIsBlocked()) {
			turnLeft();
		} else {
			move();
		}

	}

	public void goHigh() {
		while (rightIsBlocked() && frontIsClear()) {
			move();
		}
		if (rightIsClear() || frontIsClear()) {
			turnLow();
			goLow();
		}

	}

	public void turnLow() {
		for (int i = 0; i < 2; i++) {
			turnRight();
			move();
		}

	}

	public void goLow() {
		while (rightIsBlocked() && frontIsClear()) {
			move();
		}
		turnHigh();
		goHigh();

	}

	public void turnHigh() {
		if (frontIsBlocked() && rightIsBlocked()) {
			turnLeft();
			moveBlocked();
		}
	}
}
