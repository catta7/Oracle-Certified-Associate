/** 
 *  Describes a Duck.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;


public class Duck extends Animal {
	private static final String SOUND = "Quack";

	public Duck(String name){
		super(name, Duck.SOUND);
	}

}
