import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class listAllGMOFiles {
	
	private File mainFolder;
	private ArrayList<File> GMOList;
	
	
	listAllGMOFiles(File folder){
		
		mainFolder = folder;
		GMOList = new ArrayList<File>();
		findGMORecursivly(mainFolder);
		
	}
	//I dunno what streams are so here im gonna list all amd files
	void findGMORecursivly(File directory){
		
		File[] filesInside = directory.listFiles();//gets files inside directory
		for(File lookat : filesInside) {
			if(lookat.isDirectory()) {//checks if there is another directory if there is go back up
		
				findGMORecursivly(lookat);
			}else if(    (lookat.getName().substring(lookat.getName().length()-3)).equals("amd")   ){//if the file has amd extension add it to the list
				
				GMOList.add(lookat);
			}
			
		}
	}
	
	
	ArrayList<File> getGMOFiles() {
	
		return GMOList;
	}

}
