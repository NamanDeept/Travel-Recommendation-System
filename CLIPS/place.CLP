(deftemplate answer
	(slot name)
)

(defrule main
	(place (name ?placename)(transport $? ?tt $?)(place_type $? ?pt $?)(food $? ?ft $?)(weather ?wt)(budget $? ?bt $?)(duration $? ?dt $?))
	(tt ?placename)
	(place (name ?placename1)(transport $? ?tt $?)(place_type $? ?pt $?)(food $? ?ft $?)(weather ?wt)(budget $? ?bt $?)(duration $? ?dt $?))
	
	=>
	 (assert (answer (name ?placename1)))
)