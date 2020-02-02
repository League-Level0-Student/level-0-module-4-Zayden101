package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        int vacation = JOptionPane.showConfirmDialog(null, "is it vaction","Sleepy Head", JOptionPane.YES_NO_OPTION);
        if (vacation==0 &&weekday==1) {
        	JOptionPane.showMessageDialog(null, "DIE IN A OVER MICRAWAVED PIZZA");

        }
        if (vacation==1 &&weekday==0) {
        	JOptionPane.showMessageDialog(null, "GET UP, THE POOP IS COMMING OUT!!!");

        }
        if (vacation==1 &&weekday==1) {
        	JOptionPane.showMessageDialog(null, "u suk");

        }
        /*
         * Print “sleep in�? if it is a vacation or a weekend. 
         * If it’s a weekday, print “get up lazybones!�? 
         * If it is a weekday, and we are on vacation,print “sleep in�?.
         */
    }
}
