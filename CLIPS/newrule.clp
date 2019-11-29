
(defrule main1
	(place (name ?placename)(transport $? ?tt $?)(place_type $? ?pt $?)(food $? ?ft $?)(weather ?wt)(budget ?bt $?)(duration $? ?dt $?))
	(tt ?tt)
	(pt ?pt)
	(ft ?ft)
	(dt ?dt)
	=>
	(assert (answer (name ?placename)))
	 
)
