import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		File gameFiles = new File("../placeFilesHere");
		
		System.out.print(gameFiles.getName());
	
		listAllGMOFiles gmoList = new listAllGMOFiles(gameFiles);//Im sure theres a better way of doing this.
		
		ArrayList<File> files= gmoList.getGMOFiles();
		File source = new File("../place AMD here(mustbecalled MODEL_DATA)/MODEL_DATA.amd");
		Path src = Paths.get(source.getCanonicalPath());// Get the source AMD
		
		for(int i =0;i< files.size();i++) {
			File temp = files.get(i);
			Path dest = Paths.get(temp.getCanonicalPath());
			Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
		}
		System.out.println("Done!");
		
		
	}
	
	
	
	

}
