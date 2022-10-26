package myexam1_10_26_2022;

public class Cage {
	
	private Integer length;
    private Integer width;
    private Integer height;
    private boolean clean;
    private boolean covered;
    
    public Cage(Integer length, Integer width, Integer height, boolean clean, boolean covered) {
    	this.length = length;
    	this.width = width;
    	this.height = height;
    }
    
	public Integer getLength() {
		return length;
	}
	
	public Integer getWidth() {
		return width;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public boolean isClean() {
		return clean;
	}
	
	public boolean isCovered() {
		return covered;
	}
    
    public String cleans() {
    	if(length.equals(width) && width.equals(height)){
    		covered = false;
    		return "The cage is clean.";
    	}
    	else {
    		covered = true;
    		return "The cage is not clean.";
    	}
    }
    
    public String covered() {
    	if(isCovered() == true){
    		return "The cage is covered.";
    	}
    	else {
    		return "The cage is not covered.";
    	}
    }
    
    String CageCleanInfo() {
    	return String.format("The cage length is %s, width is %s and height is %s. " + cleans(),
    			getLength(), getWidth(),getHeight());
    }
    
    String CageCoveredInfo() {
    	return covered();
    }
    
}
