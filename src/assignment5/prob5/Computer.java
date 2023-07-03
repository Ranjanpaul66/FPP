package assignment5.prob5;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
    	
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
    	
        return ramSize;
    }

    public double getProcessorSpeed() {
    	
        return processorSpeed;
    }

    public double computePower() {
    	
        return ramSize * processorSpeed;
    }

    @Override
    public boolean equals(Object obj) {
    	
        if (this == obj) {
            return true;
        }
        if ( getClass() != obj.getClass() || obj == null ) {
            return false;
        }
        Computer computer = (Computer) obj;
        
        return (ramSize == computer.ramSize) && (Double.compare(computer.processorSpeed, processorSpeed)) == 0
                && (manufacturer.equals(computer.manufacturer)) && (processor.equals(computer.processor));
    }

    @Override
    public String toString() {
        return "Computer " +
                "manufacturer '" + manufacturer +  "', processor '" + processor  + "', ramSize " + ramSize +
                "', processorSpeed " + processorSpeed ;
    }
}

