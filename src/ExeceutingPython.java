import java.io.IOException;


public class ExeceutingPython {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] cmd = {
			      "python",
			      "F:/Users/subhajit/workspace/IntelloLabsDemo/myscript.py",
			      "bony",
			    };
			    try {
					Runtime.getRuntime().exec(cmd);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
