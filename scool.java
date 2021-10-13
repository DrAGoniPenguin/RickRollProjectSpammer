package scool;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Unfunni {
//speedrun any% rsg during biology omg im so good lmao
	public static void main(String[] args) {
		
	    switch (Unfunni.getOS()) {
		    case WINDOWS:
    			System.out.println("Ur on windows sir");
		    	Desktop desktop = Desktop.getDesktop();
		    	URI url = null;
		    	try {
		    		url = new URI("https://imgur.com/a/pmSuXlo");
		    		while(true) {
		    		desktop.browse(url);
		    		Thread.sleep(5000);		    		
		    		}
		    		
	    		} catch (URISyntaxException e) {
	    			e.printStackTrace();
	    		}catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}catch (IOException e) {
	    			e.printStackTrace();
	    		}
		    	break;
		    	/* the only one ive tested on was windows and im too lazy to create a vm again 
		    	 	and i never used collapse or mac for coding (except for crap school stuff)	
		    	 */
		    case LINUX:

		    break;
		    
		    case MAC:
		    	
		    break;
		    
		    case IDunno:
		    	
		    break;
		    
		    case COLLAPSEOS:
		    	
		    break;
	    }
	}
	
    private enum OS {
        WINDOWS, LINUX, MAC, IDunno, COLLAPSEOS //added collapse for the end of teh world
    }

	private static OS os = null;
	
	private static OS getOS() {
	    if (os == null) {
	        String operSys = System.getProperty("os.name").toLowerCase();
	        if (operSys.contains("win")) {
	            os = OS.WINDOWS;
	        }else if (operSys.contains("mac")) {
	            os = OS.MAC;
	        }else if (operSys.contains("lin")) {
	        	os = OS.LINUX;
	        }else if (operSys.contains("")) { //i also dont know what Collapse is called so...
	        	os = OS.COLLAPSEOS;
	        }else {
	        	os = OS.IDunno;
	        }
	    }
	    return os;
	}
}
