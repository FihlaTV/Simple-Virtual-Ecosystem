package sve.core;

import sve.gui.Renderable;

// TODO
public abstract class Animal implements LivingBeing, LifeTime, Movable, Renderable {

	@Override
	public Point2D<Integer> location() {
		return location;
	}

	@Override
	public double speed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Sex sex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double fertility() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int heat() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LifePeriod periodOfLife() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int resourceValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResourceType resourceType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int gestation() {
		// TODO Auto-generated method stub
		return 0;
	}
}
