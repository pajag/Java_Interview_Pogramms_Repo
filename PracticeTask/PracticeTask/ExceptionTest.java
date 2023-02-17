package PracticeTask;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
        p();
  	}

	
		static void m() throws IOException{  
	     
	     throw new IOException("device error");//checked exception  
	    }  
	   static void n()throws IOException{  
	       m();  
	    }  
	   static void p(){  
	     try{  
	        n();  
	     }catch(Exception e)
	     {
	    	e.printStackTrace();
	    	 System.out.println("exception handled");
	      }  
	   }
    } 

