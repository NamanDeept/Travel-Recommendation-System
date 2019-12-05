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

public class SearchWindow {
	String s;
	SearchWindow(String ss) throws IOException{
		
		s=ss;
		
		
		
		
	try {
		
		Environment clips = new Environment();
		//if the url doesn't run please put in the default system path inside the load function for clp files
		clips.load("..\\CLIPS\\facts.clp");
		clips.load("..\\CLIPS\\place.CLP");
		clips.reset();
		
		String placename = s;
		
		
		clips.eval("(assert(tt "+placename+"))");
		
		clips.run();
		
		
		ArrayList<FactAddressValue> fv = (ArrayList<FactAddressValue>) clips.findAllFacts("answer");
		s="";
		for(FactAddressValue p :fv) {
			s = s+p.getSlotValue("name")+"\n";
			System.out.println(p.getSlotValue("name"));
		}
		
		
		NewJFrame2 jf = new NewJFrame2(s);
		
	}catch (CLIPSException e1) {
		e1.printStackTrace();
	}

}
}
