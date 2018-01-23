import javax.swing.SwingUtilities;


public class StartApp {
	
	 public static void main(String [] args) {

	        SwingUtilities.invokeLater(new Runnable() {

	            @Override
	            public void run() {

	                new StartApp().start();
	            }
	        });
	    }

	    private void start() {
		
	      UserInfo ob= new UserInfo();
	    }

}
