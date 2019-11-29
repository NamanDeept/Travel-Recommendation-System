import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import java.util.*;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import net.sf.clipsrules.jni.CLIPSException;
import net.sf.clipsrules.jni.CLIPSLoadException;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;


public class Results {
	
	int[] filter = new int[6];
	Environment clips;
	MakeNewFile mkf;
	JFrame frame;
	Results(){
		for(int i=0;i<6;i++) filter[i]=1;
		//filter[0]=0;
	}
	void initiate(String[] varname, String[] selected)  throws IOException{
		try {
			clips = new Environment();
			clips.clear();
			clips.load("\\facts.clp");
			mkf = new MakeNewFile(filter,"\\newrule.clp","\\mainrule.clp");
			clips.load("\\newrule.clp");
			clips.reset();
			int i=0;
			for(i=0;i<6;i++)
				clips.eval("(assert("+varname[i]+" "+selected[i]+"))");
			clips.run();
			ArrayList<FactAddressValue> fv = (ArrayList<FactAddressValue>) clips.findAllFacts("answer");
			for(FactAddressValue p :fv) {
				System.out.println(p.getSlotValue("name"));
			}
		}catch (CLIPSException e1) {
			e1.printStackTrace();
		}
	}
}
