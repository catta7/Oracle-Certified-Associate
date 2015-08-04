/** 
 *  Class definition.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;

public class Cat extends Animal{
//	private String name;
	private static final String SOUND = "Meow!";

	public Cat(String name){
		super(name, Cat.SOUND);
	}
	
//	public void makeNoise(){
//		System.out.println(this.name + " says Meow!");
//	}
//	
//	public String toString(){
//		return this.name;
//	}
	
}

