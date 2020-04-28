import cv2
import random
def noteFrequencies():
	val, note = random_note('A5', 'E4', 5)
	return val, note
def random_note(last, first, notes):
	# plan on making a list of differnt sheets according to the last and the first
	# once it satisfies select five notes of the sheet when is not more increase than the
	# note range
	# as if it a 
	# *****12345**
	# ****12534***
	# **53412*****
	# an example for note selection is to select one of these
	# or an alternative
	# **12672345**
	# ****1234567*
	# select the closer ones to the number of notes 'notes' variable
	# then generate the sheet music using the cv2 library by drawing it on line photo at
	# the 'assets' folder
