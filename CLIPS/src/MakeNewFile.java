import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class MakeNewFile {
	MakeNewFile(int[] filter, String newpath , String oldpath) throws IOException{
		String[] vars = new String[6];
		
		
		
		File f = new File(oldpath);
		Scanner s = new Scanner(f);
		ArrayList<String> cont = new ArrayList<>();
		System.out.println(filter[0]+" "+filter[1]+" "+filter[2]+" "+filter[3]+" "+filter[4]+" "+filter[5]);
		while(s.hasNext()) {
			String nl = s.nextLine();
			if(nl.contains("(tt ?tt)")&&filter[0]==0) continue;
			if(nl.contains("(pt ?pt)")&&filter[1]==0) continue;
			if(nl.contains("(ft ?ft)")&&filter[2]==0) continue;
			if(nl.contains("(wt ?wt)")&&filter[3]==0) continue;
			if(nl.contains("(dt ?dt)")&&filter[4]==0) continue;
			if(nl.contains("(bt ?bt)")&&filter[5]==0) continue;
			cont.add(nl+"\n");
		}
		FileWriter fw = new FileWriter(newpath);
		for(String str : cont) {
			fw.write(str);
		}
		fw.close();
	}
}
