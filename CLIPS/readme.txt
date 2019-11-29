GROUP NAME : PROJECT GROUP 6
MEMBERS: Aadya Mishra , Prateek Kumar Nayak , Kiran Kumar Datti , Ishan Arora , Vikrant Singh , Srikar Anand Yellapragada , Akshay Gupta , Naman Deept
PROJECT NAME: Travel Recommendation Expert System

PROJECT DESCRIPTION: 
This project built in CLIPS uses several facts and rules , utilizes the powerful inference engine of CLIPS and backward chaining method to 
come up to recommend possible places to visit after taking user's choices to visit.


This system recommends place(s) to visit based on choices which the users enters while answering each of the questions.

Entered inputs should be as indicated while question is prompted.

Based on inputs , those places which satisfies all the conditions are being recommended .

After enough information is obtained to sucessfully recommend a place to visit, the expert system displays all the possible places that satisfies the conditions .

A sample execution of the program is shown to help better understand the execution of the program .

------------------------------------------------------------------------------
------------------------ Travel Recommendation System ------------------------
------------------------------------------------------------------------------

Enter Transport---------------(Air/Train/Road/Sea)
Road
Enter Place Type-------------(Heritage/Religious/Adventure/Hill/Beach/Desert)
Heritage
Enter Food Type------------(Indian/Continental/Chinese/Thai/Italian/Other)
Indian
Enter Weather---------------(Hot/Cold/Moderate/Rainy)
Hot
Enter Duration---------------(under3days/3-5days/over5days)
under3days
Enter Budget----------------(under20k/20k-50k/over50k)
under20k

-----------------------------------------------------------------------------
Recommended place(s) to visit is/are-
-----------------------------------------------------------------------------

Jaisalmer
Jodhpur
Orchaa

Software Installation :

CLIPS 6.3
CLIPSIDE
Java JDK 1.8
CLIPSJNI

HOW TO RUN: 

Open the CLIPSIDE and in the dialog window run these 4 commands as below in order :

1.(clear)
2.(load travelrecommendationsystem.clp) or load buffer from the "travelrecommendationsystem.clp" in the IDE. 
3.(reset)
4.(run)

How to run the GUI of the project :

Open 
1. run Main.java 
2. Follow the steps as in GUI 
3. It shows the recommended places to visit based on several parameters or you can enter place of your choice and our expert systems recommends similar place that you may like .


FILES USED:
travelrecommendation.clp
facts.clp   --------------------------- contains all the facts required for the expert system
newrule.clp --------------------------- contains rule for the expert system to recommend places based on input
place.clp   --------------------------- contains rule for the expert system to recommend places based on an input place.

README.txt