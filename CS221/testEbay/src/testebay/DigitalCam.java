/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebay;

/**
 *
 * @author mena
 */
class DigitalCam {
    private String mark;
	private float resolution;
	
	public DigitalCam(String mark, float resolution){
		this.mark = mark;
		this.setResolution(resolution);
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public float getResolution() {
		return resolution;
	}

	public void setResolution(float resolution) {
		this.resolution = resolution;
		
		if(this.resolution > 10){
			this.resolution = 10;
		}
	}

	public float getPrice() {
		if(this.resolution <= 6){
			return 99;
		} else {
			return 129;
		}		
	}
	
	public String toString(){
		StringBuilder b = new StringBuilder();
		
		b.append("Brand: ");
		b.append(this.mark);
		b.append("; Resolution: ");
		b.append(this.resolution);
		b.append("; Price: ");
		b.append(this.getPrice());
		
		return b.toString();
    }
    
}
