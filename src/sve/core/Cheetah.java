package sve.core;

import sve.gui.RenderTypes;

public class Cheetah extends Animal {
	
	public Cheetah(Sex sex, int age, int weight, int height, double speed, int gestation){
		// TODO
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
    public String pathTo(RenderTypes type) {
        return "file:src/sve/gui/sample/images/64-cheetah.jpg";
    }
    
    @Override
	public int gestation() {
		// TODO Auto-generated method stub
		return 0;
	}
}
