(deftemplate place
 (slot name)
 (multislot transport)
 (multislot place_type)
 (multislot food)
 (slot weather)
 (multislot budget)
 (multislot duration)
)
(deffacts initial
(place
	(name Allahabad) 
	(transport Air Train Road ) 
	(place_type Religious)
	(food Indian Continential Other)
	(weather Hot)
	(budget under20k )
	(duration 3-5days)
)

(place
	(name Goa) 
	(transport Air Train Road Sea) 
	(place_type Beach)
	(food Seafood Thai Indian Other)
	(weather Moderate)
	(budget under20k 20k-50k )
	(duration 3-5days over5days)
)

(place
	(name Mcleodganj) 
	(transport Air Train Road) 
	(place_type Hill)
	(food Chinese Indian Italian Tibetan Other)
	(weather Cold)
	(budget under20k )
	(duration under3days 3-5days)
)

(place
	(name Srinagar) 
	(transport Air Train Road) 
	(place_type Hill)
	(food Indian Continential Tibetan Other)
	(weather Cold)
	(budget under20k 20k-50k)
	(duration 3-5days over5days)
)

(place
	(name Andaman) 
	(transport Air Sea) 
	(place_type Beach)
	(food Seafood Thai Continential Indian Other)
	(weather Moderate)
	(budget under20k 20k-50k )
	(duration under3days 3-5days over5days)
)

(place
	(name Leh-Ladakh) 
	(transport Air Train Road) 
	(place_type Hill)
	(food Indian Chinese Tibetan Other)
	(weather Cold)
	(budget under20k )
	(duration 3-5days over5days)
)

(place
	(name Binsar) 
	(transport Air Train Road) 
	(place_type Adventure)
	(food Indian Continental Other)
	(weather Cold)
	(budget under20k )
	(duration under3days 3-5days)
)

(place
	(name Coorg) 
	(transport Air Train Road ) 
	(place_type Hill)
	(food Continential South-Indian Other)
	(weather Moderate)
	(budget under20k )
	(duration under3days 3-5days)
)

(place
	(name Kerela) 
	(transport Air Train ) 
	(place_type Wildlife)
	(food South-Indian Seafood Thai Other)
	(weather Rainy)
	(budget under20k 20k-50k)
	(duration 3-5days over5days)
)

(place
	(name Kasol) 
	(transport Air Train Road ) 
	(place_type Hill)
	(food Indian Chinese Tibetan Other)
	(weather Cold)
	(budget under20k )
	(duration under3days 3-5days)
)

(place
	(name Kutch) 
	(transport Air Train) 
	(place_type Desert)
	(food Indian Other)
	(weather Moderate)
	(budget under20k )
	(duration under3days)
)

(place
	(name Bir-Billing) 
	(transport Air Train Road ) 
	(place_type Adventure)
	(food Indian Continental Other)
	(weather Moderate)
	(budget under20k )
	(duration under3days 3-5days)
)

(place
	(name Assam) 
	(transport Air Train ) 
	(place_type Hill)
	(food Indian Tibetan Other)
	(weather Moderate)
	(budget under20k 20k-50k over50k)
	(duration 3-5days over5days)
)

(place
	(name Rishikesh) 
	(transport Air Train Road ) 
	(place_type Hill)
	(food Indian Other)
	(weather Cold)
	(budget under20k)
	(duration under3days 3-5days)
)

(place
	(name Shimla) 
	(transport Air Train Road ) 
	(place_type Hill)
	(food Indian Tibetan Other)
	(weather Cold)
	(budget under20k )
	(duration under3days 3-5days)
)

(place
	(name Tirthan-Valley) 
	(transport Air Train Road ) 
	(place_type Adventure)
	(food Indian Tibetan Other)
	(weather Cold)
	(budget under20k )
	(duration under3days 3-5days)
)

(place
	(name Jim-Corbett) 
	(transport Air Train Road ) 
	(place_type Adventure)
	(food Indian Other)
	(weather Moderate)
	(budget under20k)
	(duration under3days 3-5days)
)

(place
	(name Manali) 
	(transport Air Train Road ) 
	(place_type Hill)
	(food Indian Tibetan Other)
	(weather Cold)
	(budget under20k )
	(duration under3days 3-5days)
)

(place
	(name Udaipur) 
	(transport Air Train Road ) 
	(place_type Heritage)
	(food Indian Rajasthani Other)
	(weather Moderate)
	(budget under20k 20k-50k)
	(duration under3days 3-5days over5days)
)

(place
	(name Auli) 
	(transport Air Train Road ) 
	(place_type Hill)
	(food Indian Tibetan Chinese Other)
	(weather Cold)
	(budget under20k )
	(duration under3days 3-5days over5days)
)
(place
(name Mysore)
(transport Air Train Road )
(place_type Heritage)
(food Indian Continential Chinese)
(weather Moderate)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Valley-Of-Flowers)
(transport Air Train Road ) 
(place_type Hill Adventure)
(food Indian Other)
(weather Cold)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Jaisalmer)
(transport Air Train Road )
(place_type Heritage Desert)
(food Indian Continential Rajasthani Other)
(weather Hot)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Jodhpur)
(transport Air Train Road )
(place_type Heritage Desert)
(food Indian Continential Rajasthani Other)
(weather Hot)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Prashar-Lake)
(transport Air Train ) 
(place_type Hill Adventure)
(food Indian Other)
(weather Cold)
(budget under20k )
(duration under3days 3-5days )
)

(place
(name Mukteshwar)
(transport Air Train Road) 
(place_type Adventure)
(food Indian Chinese Other)
(weather Cold)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Dhanaulti)
(transport Air Train Road) 
(place_type Hill Adventure)
(food Indian Chinese Other)
(weather Cold)
(budget under20k )
(duration under3days )
)

(place
(name Vanarasi)
(transport Air Train Road )
(place_type Religious)
(food Indian Other)
(weather Moderate)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Mumbai)
(transport Air Train Road )
(place_type Beach Heritage)
(food Indian Seafood Other)
(weather Moderate)
(budget under20k 20k-50k)
(duration 3-5days over5days)
)

(place
(name Kolkata)
(transport Air Train Road )
(place_type Beach Heritage)
(food Indian Seafood Other)
(weather Moderate)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Delhi)
(transport Air Train Road )
(place_type Heritage)
(food Indian Punjabi Chinese Continential Other)
(weather Moderate)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Meghalaya)
(transport Air Train Road )
(place_type Hill Adventure)
(food Indian Chinese Thai Tibetan Other)
(weather Rainy)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Sikkim)
(transport Air Train Road )
(place_type Hill Adventure)
(food Indian Chinese Thai Tibetan Other)
(weather Cold)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Agra)
(transport Air Train Road )
(place_type Heritage)
(food Indian Chinese Other)
(weather Moderate)
(budget under20k)
(duration under3days 3-5days over5days)
)

(place
(name Cherrapunji)
(transport Air Train Road )
(place_type Hill)
(food Indian Chinese Thai Other)
(weather Rainy)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Dalhousie)
(transport Air Train Road )
(place_type Hill Wildlife Adventure)
(food Indian Chinese Other)
(weather Cold)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Hampi)
(transport Air Train Road )
(place_type Heritage)
(food Indian Chinese Italian Other)
(weather Moderate)
(budget under20k)
(duration under3days 3-5days over5days)
)

(place
(name Jabalpur)
(transport Air Train )
(place_type Religious)
(food Indian Chinese Other)
(weather Moderate)
(budget under20k)
(duration under3days 3-5days)
)

(place
(name Mathura)
(transport Air Train Road)
(place_type Religious)
(food Indian Other)
(weather Moderate)
(budget under20k)
(duration under3days 3-5days over5days)
)




(place
(name Spiti)
(transport Air Train Road )
(place_type Hill Adventure)
(food Indian Continential Chinese)
(weather Cold)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Sonamarg)
(transport Air Train Road ) 
(place_type Hill Adventure)
(food Indian Other)
(weather Cold)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Almora)
(transport Air Train Road )
(place_type Heritage Desert)
(food Indian Continential Rajasthani Other)
(weather Moderate)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Orchha )
(transport Air Train Road )
(place_type Heritage Desert)
(food Indian Continential Rajasthani Other)
(weather Hot)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Gwalior)
(transport Air Train Road) 
(place_type Religious Adventure)
(food Indian Other)
(weather Moderate)
(budget under20k )
(duration under3days 3-5days )
)

(place
(name Gokarna)
(transport Air Train Road) 
(place_type Adventure Heritage Beach)
(food Indian Chinese Other)
(weather Moderate)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Pahalgam)
(transport Air Train ) 
(place_type Heritage Adventure)
(food Indian Chinese Other)
(weather Moderate)
(budget under20k )
(duration under3days )
)

(place
(name Landsdowne)
(transport Air Train Road )
(place_type Religious Heritage Hill)
(food Indian Other)
(weather Moderate)
(budget under20k )
(duration under3days 3-5days over5days)
)

(place
(name Joshimath)
(transport Air Train Road )
(place_type Hill Heritage)
(food Indian Seafood Other)
(weather Moderate)
(budget under20k 20k-50k)
(duration 3-5days over5days)
)

(place
(name Tawang)
(transport Air Train Road )
(place_type Hill Heritage)
(food Indian Seafood Other)
(weather Cold)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Manikaran)
(transport Air Train Road )
(place_type Heritage Religious)
(food Indian Punjabi Chinese Continential Other)
(weather Moderate)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Shimoga )
(transport Air Train Road )
(place_type Hill Adventure)
(food Indian Chinese Thai Tibetan Other)
(weather Rainy)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Madikeri)
(transport Air Train Road )
(place_type Hill Adventure)
(food Indian Chinese Thai Tibetan Other)
(weather Moderate)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Ranikhet)
(transport Air Train Road )
(place_type Heritage Hill)
(food Indian Chinese Other)
(weather Moderate)
(budget under20k)
(duration under3days 3-5days over5days)
)

(place
(name Kausani)
(transport Air Train Road )
(place_type Hill Adventure)
(food Indian Chinese Thai Other)
(weather Rainy)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)

(place
(name Agumbe)
(transport Air Train Road )
(place_type Hill Wildlife Adventure)
(food Indian Chinese Other)
(weather Moderate)
(budget under20k 20k-50k)
(duration under3days 3-5days over5days)
)



(place
(name Amritsar)
(transport Air Train Road ) 
(place_type Religious)
(food Indian Continential Punjabi Other)
(weather Hot)
(budget under20k )
(duration 3-5days)
)

(place
(name Orissa) 
(transport Air Train Road ) 
(place_type Heritage)
(food Indian Continential Other)
(weather Moderate)
(budget under20k )
(duration 3-5days)
)

(place
(name Mahabalipuram) 
(transport Air Train Road ) 
(place_type Heritage)
(food Indian Continential Other)
(weather Hot)
(budget under20k )
(duration 3-5days)
)

(place
(name Visakhapatnam) 
(transport Air Train Road ) 
(place_type Beach)
(food Indian Seafood Punjabi)
(weather Moderate)
(budget under20k )
(duration 3-5days)
)

(place
(name Ooty) 
(transport Air Train Road ) 
(place_type Hill)
(food Indian Continental)
(weather Moderate)
(budget under20k )
(duration under3days)
)

(place
(name Kodaikanal) 
(transport Train Road )
(place_type Hill)
(food Indian Continental Other)
(weather Moderate)
(budget 20k-50k )
(duration under3days)
)

(place
(name Pondicherry)
 (transport Train Road )
 (place_type Beach)
 (food Indian Seafood)
 (weather Moderate)
 (budget 20k-50k )
 (duration under3days)
)

(place
(name Mahabaleshwar)
(transport Train Road )
(place_type Hill)
(food Indian Seafood)
(weather Moderate)
(budget 20k-50k )
(duration under3days)
)

(place
(name Darjeeling)
(transport Air Train Road )
(place_type Hill)
(food Indian Continental)
(weather Cold)
(budget 20k-50k )
(duration under3days)
)

(place
(name Ziro)
(transport Air Train Road )
(place_type Hill)
(food Indian Other)
(weather Cold)
(budget under20k )
(duration 3-5days)
)

(place
(name Khajjiar)
(transport Train Road )
(place_type Hill)
(food Indian Continental Other)
(weather Cold)
(budget under20k )
(duration 3-5days)
)

(place
(name "Mount Abu")
(transport Train Road )
(place_type Hill)
(food Indian Continental Other)
(weather Hot)
(budget under20k )
(duration under3days)
)

(place
(name Hyderabad)
(transport Air Train Road)
(place_type Heritage)
(food Indian Italian Chinese Continential South-Indian Other)
(weather Moderate)
(budget under20k )
(duration under3days 3-5days)
)
)



(defrule travelrecommend(declare (salience 1))
 =>
(printout t crlf)
(printout t "--------------------------------------------------------------------------------------------" crlf)
(printout t "------------------------ WELCOME TO THE TRAVEL RECOMMENDATION SYSTEM------------------------" crlf)
(printout t "--------------------------------------------------------------------------------------------" crlf)
(printout t crlf) 
)

(defrule input
	(initial-fact)
	=>
(printout t "Enter Transport--------(Air/Train/Road/Sea)" crlf )
	(assert (tt (read)))
(printout t "Enter Place Type--------(Heritage/Religious/Adventure/Hill/Beach/Desert)" crlf )
	(assert (pt (read)))
(printout t "Enter Food Type---------(Indian/Continental/Chinese/Thai/Italian/Other)" crlf )
	(assert (ft (read)))
(printout t "Enter Weather-----------(Hot/Cold/Moderate/Rainy)" crlf )
	(assert (wt (read)))
(printout t "Enter Duration-----------(under3days/3-5days/over5days)" crlf )
	(assert (dt (read)))
(printout t "Enter Budget-------------(under20k/20k-50k/over50k)" crlf )
	(assert (bt (read)))
(printout t "---------------------------------------------------------------------------------------------" crlf)
(printout t "Recommended places to visit are" crlf)
(printout t "---------------------------------------------------------------------------------------------" crlf)
)
(defrule main
	(place (name ?placename)(transport $? ?tt $?)(place_type $? ?pt $?)(food $? ?ft $?)(weather ?wt)(budget ?bt $?)(duration $? ?dt $?))
	(tt ?tt)
	(pt ?pt)
	(ft ?ft)
	(wt ?wt)
	(bt ?st)
	(dt ?dt)
	=>
	(printout t ?placename crlf )
)