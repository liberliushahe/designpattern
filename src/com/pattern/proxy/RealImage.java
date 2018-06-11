package com.pattern.proxy;

public class RealImage implements Image {
private String filename;
   public RealImage(String filename){
	 this.filename=filename;
   }
	@Override
	public void display() {
		// TODO Auto-generated method stub
      loadFileFromDisk(filename);
      System.out.println(filename);

	}
    private void loadFileFromDisk(String filename){
    	System.out.println("load from disk:"+filename);
    }
}
