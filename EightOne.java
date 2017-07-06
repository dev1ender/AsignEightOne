
//class that implements Runnable interface used to create thread
class timeout implements Runnable{

	//run method that automatically run when thread is started
	public void run() {
		for(int i=10;i>=0;i--){  //count down loop

			System.out.println(i);
			try {
				Thread.sleep(1000);			//putting the thread to the sleep state for 1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Timeout");    //after the loop is over the timeout msg will be printed
	}
	
}


//class that conain the main method
public class EightOne {

	//main metod
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating  object of thread class and passing the timoutclass object to its constructor
		Thread t1 = new Thread(new timeout());
		System.out.println("Count Down starts:");
		t1.start(); //starting the thread
		
	}

}
