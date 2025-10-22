package exam1020;

public class Tire {
 protected String model;
 protected int maxRotation;
 protected int currentRotation;

 public Tire(String model, int maxRotation) {
     this.model = model;
     this.maxRotation = maxRotation;
     this.currentRotation = 0;
 }

 public boolean roll() {
     if (currentRotation >= maxRotation) {
         return false;
         }
     else {
    	 currentRotation++;
    	 return true;   
    	 }
    }

 public String getModel() {
	return model;
 }

 public void setModel(String model) {
	this.model = model;
 }

 public int getMaxRotation() {
	return maxRotation;
 }

 public void setMaxRotation(int maxRotation) {
	this.maxRotation = maxRotation;
 }

 public int getCurrentRotation() {
	return currentRotation;
 }

 public void setCurrentRotation(int currentRotation) {
	this.currentRotation = currentRotation;
 }
 
}


