Tyler Daniels
William Pennebaker
Ramon Nieves
					Algorithm game v4

Throws IOException
Declare and initialize Variables and constants 
Loop to play game
do{
display into; 
prompt user for name
loop for menu
do {
display main menu
display main menu options
apply ignore case to end loop 
 Read questions.txt
File infile =  new File ("questions.txt")
create scanner object to read from file
scanner FileIn = new Scanner (inFile);
for(int i =1; i < 7; i++) {
Read data from questions.txt
 display question and answer options
prompt user for answer
Display correct answer and point value on next line
display correct answer and score total on next lines
 close questions.txt
fileIn.close();
 read file for highscore
fileReader infile2 = new FileReader("highscore.txt")
new scanner for high score
Scanner fileIn2 = new Scanner(inFile2)
reads high score
highscore = fileIn2.nextInt();
close high score
if (score > high score){
write to file highscore.txt
display high score
else 
display end message
loop to play game again or end.
