package assignment5.prob5;


public class Main {
    public static void main(String[] args) {
    	System.out.println("Ranjan".equals("Ranjan"));
    	
        Computer computer1 = new Computer("Manufacturer 1", "Processor 1", 4, 3.2);
        Computer computer2 = new Computer("Manufacturer 2", "Processor 2", 16, 4.5);

        System.out.println(computer1 +"\n " +computer2);

        System.out.println("Ram size of computer 1  " + computer1.getRamSize()+ "\n "+"Processor speed of computer 2  " + computer2.getProcessorSpeed() );

        System.out.println("Power of computer 1  " + computer1.computePower() + "\n "+ "Power of computer 2  " + computer2.computePower() );

        System.out.println("computer 1 and computer 2 are equal or not " + computer1.equals(computer2) + "\n " + "computer 1 and computer 1 are equal or not" + computer1.equals(computer1));
    }
}