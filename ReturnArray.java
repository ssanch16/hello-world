package computerProgramming;


public static void @ main(String:: args) {
	// TODO Auto-generated method stub
	Character [] y = { 'b', 'd', 'a', 'b', 'f', 'm', 'g', 'n', 'a','f'};
	
	Character []  value1 = removeDuplicates(y);{
	for (Character character : value1); {
		//System.out.println(character);
	}
	public static Character[] removeDuplicates; Character[] in; {  // true true true 
    	boolean keepers[] = new boolean[in.length];
   	 
    	// To start we indicate that each value will be kept
    	for(int i=0; i<in.length; i++){
        	keepers[i] = true;
    	}
   	 
    	// Scan for duplicates starting with each character
    	for(int i=0; i<in.length; i++){
    	 	// Only scan the rest if not a duplicate
        	if(keepers[i])
            	for(int j=i+1; j<in.length; j++){
            	if(in[i] == in[j])
                	keepers[j] = false;
            	}
    	}
   	 
    	// Find the number of non-duplicates
    	int count = 0;
    	for(int i=0; i<in.length; i++){
        	if(keepers[i])
            	count++;
    	}
   	 
    	// Create and copy non duplicates
    	Character result[] = new Character[count];
    	int position = 0;
    	for(int i=0; i<in.length; i++){
        	if(keepers[i]){
            	result[position] = in[i];
            	position++;
        	}
    	}
   	 
    	return result;
 }
	}
}


public static int[] remove(int v, int[] in){
  	 
	// Find the number of values that will be in the result
	int count = 0;{
	for(int i=0; i<in.length; i++){
    	if(in[i] != v)
        	count++;
	}
  	 
	// Copy the values to the result
	int result[] = new int[count];
	int position = 0;
	for(int i=0; i<in.length; i++){
    	if(in[i] != v){
        	result[position] = in[i];
        	position++;
    	}
	}
	return result;
}


public static int[] combineOrder(int[] order1, int[] order2){
    
    // Find the number of values that will be in the result
    int[] combinedOrder = new int[5];
    for(int i=0; i<5; i++){
        combinedOrder[i] = order1[i] + order2[i];
    }
    
    return combinedOrder;
}
}