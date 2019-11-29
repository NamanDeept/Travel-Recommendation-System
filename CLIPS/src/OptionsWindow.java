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

public class OptionsWindow {
	OptionsWindow(){
		JFrame frame = new JFrame("Options Selection");
		frame.setSize(700,800);
	    frame.setVisible(true);
	    
	    
	    //(printout t "Enter Transport--------(Air/Train/Road/Sea)" crlf )
	    JLabel transportlabel = new JLabel("Transportation");
	    transportlabel.setFont (transportlabel.getFont ().deriveFont (20.0f));
	     
	    frame.add(transportlabel);
	    transportlabel.setBounds(25, 40, 300, 40);
		String[] TransportTypes = {"","Air","Train","Road","Sea"};
	    JComboBox transport = new JComboBox(TransportTypes);
	    transport.setFont (transportlabel.getFont ().deriveFont (20.0f));
		frame.add(transport);
		transport.setBounds(300, 40, 300, 40);
		
		
		//(printout t "Enter Place Type--------(Heritage/Religious/Adventure/Hill/Beach/Desert)" crlf )
		
		JLabel placetypelabel = new JLabel("Place Type");
	    placetypelabel.setFont (placetypelabel.getFont ().deriveFont (20.0f));
	    frame.add(placetypelabel);
	    placetypelabel.setBounds(25,120 , 300, 40);
		String[] placetypeTypes = {"","Heritage","Religious","Adventure","Hill","Beach","Desert"};
	    JComboBox placetype = new JComboBox(placetypeTypes);
	    placetype.setFont (transportlabel.getFont ().deriveFont (20.0f));
		frame.add(placetype);
		placetype.setBounds(300, 120, 300, 40);
		
		
		//(printout t "Enter Food Type---------(Indian/Continental/Chinese/Thai/Italian/Other)" crlf )
		
		JLabel Foodlabel = new JLabel("Food Available");
	    Foodlabel.setFont (Foodlabel.getFont ().deriveFont (20.0f));
	    frame.add(Foodlabel);
	    Foodlabel.setBounds(25, 200, 300, 40);
		String[] FoodTypes = {"","Indian","Continental","Chinese","Thai","Italian","Other"};
	    JComboBox Food = new JComboBox(FoodTypes);
	    Food.setFont (transportlabel.getFont ().deriveFont (20.0f));
		frame.add(Food);
		Food.setBounds(300, 200, 300, 40);
		
		
		//(printout t "Enter Weather-----------(Hot/Cold/Moderate/Rainy)" crlf )
		
		JLabel Weatherlabel = new JLabel("Weather Condition");
	    Weatherlabel.setFont (Weatherlabel.getFont ().deriveFont (20.0f));
	    frame.add(Weatherlabel);
	    Weatherlabel.setBounds(25, 280, 300, 40);
		String[] WeatherTypes = {"","Hot","Cold","Moderate","Rainy"};
	    JComboBox Weather = new JComboBox(WeatherTypes);
	    Weather.setFont (transportlabel.getFont ().deriveFont (20.0f));
		frame.add(Weather);
		Weather.setBounds(300, 280, 300, 40);
		
		
		
		//(printout t "Enter Duration-----------(under3days/3-5days/over5days)" crlf )
		
		JLabel Durationlabel = new JLabel("Duration Length");
	    Durationlabel.setFont (Durationlabel.getFont ().deriveFont (20.0f));
	    frame.add(Durationlabel);
	    Durationlabel.setBounds(25, 360, 300, 40);
		String[] DurationTypes = {"","Under Three days","Upto One Week","More than One Week"};
	    JComboBox Duration = new JComboBox(DurationTypes);
	    Duration.setFont (transportlabel.getFont ().deriveFont (20.0f));
		frame.add(Duration);
		Duration.setBounds(300, 360, 300, 40);
		
		//(printout t "Enter Budget-------------(under20k/20k-50k/over50k)" crlf )
		
		JLabel Budgetlabel = new JLabel("Budget Range");
	    Budgetlabel.setFont (Budgetlabel.getFont ().deriveFont (20.0f));
	    frame.add(Budgetlabel);
	    Budgetlabel.setBounds(25, 440, 300, 40);
		String[] BudgetTypes = {"","Less Than Rs. 20,000/-","Rs. 20,000 - 50,000/-","More than Rs. 50,000/-"};
	    JComboBox Budget = new JComboBox(BudgetTypes);
	    Budget.setFont (transportlabel.getFont ().deriveFont (20.0f));
		frame.add(Budget);
		Budget.setBounds(300, 440, 300, 40);
		
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//System.out.println("Submit Button Clicked!");
				
				String[] selected = new String[6];
				selected[0] = TransportTypes[transport.getSelectedIndex()];
				selected[1] = placetypeTypes[placetype.getSelectedIndex()];
				selected[2] = FoodTypes[Food.getSelectedIndex()];
				selected[3] = WeatherTypes[Weather.getSelectedIndex()];
				
				//(printout t "Enter Duration-----------(under3days/3-5days/over5days)" crlf )
				//(printout t "Enter Budget-------------(under20k/20k-50k/over50k)" crlf )
				
				int durationIndex = Duration.getSelectedIndex();
				if(durationIndex==0) selected[4] = "";
				else if(durationIndex==1) selected[4] = "under3days";
				else if(durationIndex==2) selected[4] = "3-5days";
				else selected[4] = "over5days";
				
				int budgetIndex = Budget.getSelectedIndex();
				if(budgetIndex==0) selected[5]="";
				else if(budgetIndex==1) selected[5]="under20k";
				else if(budgetIndex==2) selected[5]="20k-50k";
				else selected[5]="over50k";
				
				//for(String temp : selected) System.out.println(temp);
				String[] varname = {"tt","pt","ft","wt","dt","bt"};
				
				try {
					//Results r = new Results();
					//r.initiate(varname , selected);
					NewJFrame jf = new NewJFrame(varname,selected);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		frame.add(submit);
		submit.setBounds(300, 550, 100, 30);
		
		 frame.add(new JLabel(new ImageIcon("C:\\Users\\Akshay Gupta\\Desktop\\travelrecomm\\CLIPS\\GettyImages-150127577-58f920153df78ca159d41100.jpg")));
	      
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	}
	
	
}




