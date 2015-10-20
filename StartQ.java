package primaryPackage;

public class StartQ implements IQueue{
	//@Benjamin Crysler
	//@Version 1.0
	//October 20, 2015
	//First queue for homework 3
	//No files needed or created
	//Uses no other classes
	
	final int physize = 25;
	char[] qArray = new char[physize];
	int logsize = 0;
	
	@Override
	//adds a character to the beginning of the queue
	public void add(char c) {
		qArray[logsize] = c;
		logsize++;
		System.out.println("added " + c + " to queue 1");
		return;
	}

	@Override
	//removes char at beginning of queue and shifts rest forward
	public char remove() {
		char removeChar = qArray[0];
		for(int count = 0; count < logsize; count++){
			qArray[count] = qArray[count+1];
		}
		qArray[logsize - 1] = ' ';
		logsize--;
		System.out.println("removed " + removeChar + " from queue 1");
		return removeChar;
	}

	@Override
	//returns char at front of queue
	public char front() {
		char returnChar = qArray[0];
		return returnChar;
	}

	@Override
	//checks if queue is empty
	public boolean ismt() {
		boolean returnBool;
		if(logsize == 0)
			returnBool = true;
		else
			returnBool = false;
		return returnBool;
	}

	@Override
	//checks if queue is full
	public boolean isfull() {
		boolean returnBoolean = false;
		if(logsize == physize){
			returnBoolean = true;
		}
		else{
			returnBoolean = false;
		}
		return returnBoolean;
	}

}
