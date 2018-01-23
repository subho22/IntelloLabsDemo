 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Observable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern  {

    public  void startProcess(){
  
     //Creating shared object
     BlockingQueue<String> sharedQueue = new LinkedBlockingQueue<String>();
 
     //Creating Producer and Consumer Thread
     Thread prodThread = new Thread(new Producer(sharedQueue));
     Thread consThread = new Thread(new Consumer(sharedQueue));

     //Starting producer and Consumer thread
     prodThread.start();
     consThread.start();
    }
 
}

//Producer Class in java
class Producer extends Observable implements Runnable {

    private final BlockingQueue<String> sharedQueue;

    public Producer(BlockingQueue<String> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        UserInfo.btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String text= UserInfo.txtFirstName.getText();
				
				try {
					System.out.println("\n Produced "+text);
					sharedQueue.put(text);
					displayQueue(sharedQueue);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void displayQueue(BlockingQueue<String> sharedQueue)
    {
    	System.out.println("Current queue elements ");
    	Iterator<String> iter = sharedQueue.iterator();
    	
    	while(iter.hasNext())
    		System.out.print(iter.next()+" ");
    }

}

//Consumer Class in Java
class Consumer extends Observable implements Runnable{

    private final BlockingQueue<String> sharedQueue;

    public Consumer (BlockingQueue<String> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
  
    @Override
    public void run() {
        while(true){
        	
        	String x= sharedQueue.peek();
        	
        	if(x!=null)
        	{
        		System.out.println("\n Processing "+x);
        		
        		if(runPython(x))
        		{
        			try {
						sharedQueue.take();
						System.out.println("\n Processed "+x);
						displayQueue(sharedQueue);
						DBUtil.InsertToDB(UserInfo.txtFirstName.getText(), UserInfo.textLastName.getText());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        			       			
        		}     		
        		
        	}
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        
        
    }
    
    
    public boolean runPython(String name)
    {
    	String[] cmd = {
    	      "python",
    	      "F:/Users/subhajit/workspace/IntelloLabsDemo/myscript.py",
    	      name,
    	    };
    	    try {
    			BufferedReader br = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(cmd).getInputStream()));
    			String returnname=br.readLine();
    			
    			if(name.equals(returnname))
    				return true;
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
			return false;
    }
    
    public void displayQueue(BlockingQueue<String> sharedQueue)
    {
    	System.out.println("Current queue elements ");
    	Iterator<String> iter = sharedQueue.iterator();
    	
    	while(iter.hasNext())
    		System.out.print(iter.next()+" ");
    }
  
  
}

