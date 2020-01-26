package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.awt.geom.Arc2D.Double;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		// Convert their answer to an int using Integer.parseInt()
		// Ask the user how many nickels they have
String poop=JOptionPane.showInputDialog("how meany poo do you have");
	

int nicles=Integer.parseInt(poop);
		// Ask the user how many dimes they have, and convert their answer
String poo=JOptionPane.showInputDialog("how meany poop do you have");


int dimes=Integer.parseInt(poop);
		// Ask the user how many quarters they have, and convert their answer
String poopoo=JOptionPane.showInputDialog("how meany poopoo do you have");


int quarters=Integer.parseInt(poop);
		// Calculate how much money the user has and save it in a double variable 
JOptionPane.showMessageDialog(null, "caculating");
JOptionPane.showMessageDialog(null, ".");
JOptionPane.showMessageDialog(null, "..");
JOptionPane.showMessageDialog(null, "...");
JOptionPane.showMessageDialog(null, "caculating");
JOptionPane.showMessageDialog(null, ".");
JOptionPane.showMessageDialog(null, "..");
JOptionPane.showMessageDialog(null, "...");
JOptionPane.showMessageDialog(null, "caculating");
JOptionPane.showMessageDialog(null, "finished");
JOptionPane.showMessageDialog(null, "would you like to view your money");
JOptionPane.showMessageDialog(null, "(user): yes");

double d= nicles * .05;
double c= dimes * .10;
double b= quarters * .25;
double a= d+c+b;
// Tell the user how much money they have
JOptionPane.showMessageDialog(null,a);
JOptionPane.showMessageDialog(null, "you poop a lot");
	}
}


























