public class Checker{
    int count = 0;
    boolean state = false;
    
    public boolean checkRows(char symbol, Board board){
	
	outerloop:	
	for (int i = 0; i < board.getLength(); i++){
		    
	    for (int j = 0; j < board.getHeight(); j++){
	    	if (board.get(i,j) == symbol){
	    	    count++;
		    
		    if (count == 4){
			System.out.println("Your the champion of the world!");
			state = true;
			break outerloop;
		    }
	    	} else {
		    count = 0;
		}
		
	    }
	    count = 0;
	}
	return false;
    }
    
    public boolean checkColumns(char symbol, Board board){

	outerloop:	
	for (int i = 0; i < board.getLength(); i++){
	    
	    for (int j = 0; j < board.getHeight(); j++){
	    	if (board.get(j,i) == symbol){
	    	    count++;
		    
		    if (count == 4){
			System.out.println("Your the champion of the world!");
			state = true;
			break outerloop;
		    }
	    	}
		else {
		    count = 0;
		}

	    }
	    count = 0;
	}
	return false;
    }
    
    // public boolean checkDiagLeft(char symbol, Board board){
    // 	int i = 0;
    // 	int j = 0;
    // 	int count = 0;
	
    // 	    do {
    // 		if (board.get(i,j) == 'X'){
    // 		    count++;
    // 		} else{
    // 		    count = 0;
    // 		}

    // 		System.out.println(board.get(i,j));
    // 		System.out.println(count);
    // 		count++;	    
    // 		i++;
    // 		j++;

    // 	    } while (i < board.getLength());
    // 	    return true;    
    // }

    public boolean checkDiagLeft(char symbol, Board board){
	int ii = 0, jj = 0;
	for (int i = 0; i < board.getLength(); i++){
	    for (int j = 0; j < board.getHeight(); j++){

		if (j < 5) {
		    System.out.println(j);
		} else{
		    continue;
		}
		
    		//System.out.println(board.get(i,j));
		//  		System.out.println(count);
	    }

	}
	return true;
    }

    

    public boolean getState(){
	return state;
    }
}
