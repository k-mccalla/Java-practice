package com;

public class Iteration1 {



	    public static void main(String[] args) {
	    	int playCount = 0;
		    boolean playing = true;
	    	
	        do {
	            System.out.println("Playing");
	            playCount++;

	            if(playCount > 10) {
	                playing = false;
	            }
	        } while(playing);

	        System.out.println("Game Over!");
	    }
	}
	
	
	
	
	
