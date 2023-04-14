//program to demonstrate on hierarchical inheritance
//child class1
package org.tnsif.hierarchialinheritance;
public class SnowCone extends  Andriod{
	private int versionName;
	private String modelName;
	
	//getters and setters
	public int getVersionName() {
		return versionName;
	}
	public void setVersionName(int versionName) {
		this.versionName = versionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	//default constructor
	public SnowCone() {
		System.out.println("Default constructor for child class1");
	}
	
	//parameterized constructor
	public SnowCone(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}
	
	//to string method
	@Override
	public String toString() {
		return "SnowCone [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
}
