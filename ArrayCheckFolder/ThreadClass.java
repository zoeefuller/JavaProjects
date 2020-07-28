package java_week1;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadClass implements Runnable {
	
	private AtomicBoolean keepRunning;
	String [] employees = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
    public ThreadClass() {
        keepRunning = new AtomicBoolean(true);
    }

    public void stop() {
        keepRunning.set(false);
    }

    @Override
    public void run() {
        while (keepRunning.get()) {
        	for (String i: employees) {
    			System.out.println(i);
    			try
    			{
    			    Thread.sleep(1000);
    			}
    			catch(InterruptedException ex)
    			{
    			    Thread.currentThread().interrupt();
    			}	
    		}
        }
    }
}
