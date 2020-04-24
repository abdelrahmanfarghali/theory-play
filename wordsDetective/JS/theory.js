function enterQ() {
	if(id == 1 && document.getElementById("inp").value == "W Word") {
		id = 2
		document.getElementById("riddle").innerHTML = "'Dozens' got six letters in order to pass to twelvth, super!";
	}
	if(id == 2 && document.getElementById("inp").value == "Subtract one letter") {
		id = 3
		document.getElementById("riddle").innerHTML = "A Dozen move from it's own base to an upper base and added number of rounds around the black cube, write my ip.";
	}
	if(id == 3 && document.getElementById("inp").value == "127.0.0.1") {
		id = 4
		document.getElementById("riddle").innerHTML = "Portable used my ip before 4999 ports.";
	}
	if(id == 4 && document.getElementById("inp").value == "Flask") {
		id = 5
		document.getElementById("riddle").innerHTML = "Cube that used the same port number.";
	}
	if(id == 5 && document.getElementById("inp").value == "17.098619406795") {
		id = 6
		document.getElementById("riddle").innerHTML = "How about a number of atoms?";
	}
	if(id == 6 && document.getElementById("inp").value == "Chlorine") {
		id = 7
		document.getElementById("riddle").innerHTML = "Spiritual second digit.";
	}
	if(id == 7 && document.getElementById("inp").value == "7") {
		id = 8
		document.getElementById("riddle").innerHTML = "Numbers relation are to ... questions.";
	}
	if(id == 8 && document.getElementById("inp").value == "Four") {
		id = 9
		document.getElementById("riddle").innerHTML = "Use it for defining [(2, 2), (3, 3)] with no brackets.";
	}
	if(id == 9 && document.getElementById("inp").value == "xmin, ymin, xmax, ymax") {
		id = 10
		document.getElementById("riddle").innerHTML = "how many and what shape are in the following 2:1 dimensions space";
	}
	if(id == 10 && document.getElementById("inp").value == "Two cubes") {
		id = 11
		document.getElementById("riddle").innerHTML = "What color is the big star";
	}
	if(id == 11 && document.getElementById("inp").value == "Blue") {
		id = 12
		document.getElementById("riddle").innerHTML = "How far did you reach?(10:1, 8:#, 14:2 b c)";
	}
	if(id == 12 && document.getElementById("inp").value == "Word dozen, 49991774, two blue cubes") {
		document.getElementById("riddle").innerHTML = "Successful open!";
	}
}
