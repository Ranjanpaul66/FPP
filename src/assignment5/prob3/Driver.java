package assignment5.prob3;

public class Driver {

	public static void main(String[] args) {

		UpwardHat upObj = new UpwardHat();
		UpwardHat upObj2 = new UpwardHat();
		DownwardHat downObj = new DownwardHat();
		FaceMaker faceObj = new FaceMaker();
		Vertical vertObj = new Vertical();
		
		 Figure[] figures = {
				 upObj,
				 upObj2,
				 downObj,
				 faceObj,
				 vertObj
	        };

	        for (Figure figure : figures) {
	            figure.getFigure();
	        }

	        System.out.print("\n");

	        for (Figure figure : figures) {
	            System.out.println(figure);
	        }
	}

}
