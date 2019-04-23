/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package main;

import avocado.Avocado;

/***
 * Exercise our Avocado classes
 * @author nicomp
 *
 */
public class Main {
//	enum myEnum {A,B,C,D};	// Demo of enumerated date type
//	enum enumCondition {fresh, ok, squishy, useless};

	public static void main(String[] args) {
		//Declare and instantiate an avocado object
		Avocado bob = new Avocado("green", Avocado.enumCondition.fresh, 3);
		
	//		myEnum e = myEnum.A;
	//		e = myEnum.B;
	//		System.out.println(e.toString());

	}
}
