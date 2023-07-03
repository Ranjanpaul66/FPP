package assignment5.prob3;

public class UpwardHat implements Figure{
	
	
    @Override
    public void getFigure() {
        System.out.print("/\\");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + "/\\";
    }
    
}