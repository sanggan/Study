package kakaoTest;

public class ploblem03 {
    public static boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;
    	for(int i=0; i<lock.length; i++) {
    		for(int j=0; j<lock.length; j++) {
    			if(lock[i][j] == 0) {
    				answer = false;
    			}
    		}
    	}
    	if(answer) {
    		return answer;
    	}
        for(int i =0; i<4; i++) {
        	int realtemp[][] = new int [key.length][key.length];

        	for(int j = 0 ; j < key.length; j++){
        		for(int k = 0 ; k < key.length; k++){
        		    realtemp[j][k] = key[key.length-k-1][j];
        		   }
        		}
        	for(int j = 0 ; j < key.length; j++){
        		for(int k = 0 ; k < key.length; k++){
        		    key[j][k] =  realtemp[j][k];
        		   }
        		}
        	for(int j=0; j<lock.length*2-1; j++) {
        		for(int k=0; k<lock.length*2-1; k++) {
        			int tempKey[][] = new int [lock.length][lock.length];
        			for(int x=0; x<lock.length; x++) {
        				for(int y=0; y<lock.length; y++) {
        					int tmpX = key.length-1+x-j;
        					int tmpY = key.length-1+y-k;
        					if(tmpX<key.length && tmpY<key.length&& tmpX>=0&&tmpY>=0) {
        						tempKey[x][y] = realtemp[tmpX][tmpY];
        					}
        				}
        			}
        			answer = check(tempKey, lock);
        			if(answer) return answer;
        		}
        	}
        }
        
        
        return answer;
    }
    
    public static boolean check(int [][] key, int [][] lock) {

    	for(int i=0; i<lock.length; i++) {
    		for(int j=0; j<lock.length; j++) {
    			if(lock[i][j] == 0) {
    				if(key[i][j]==0) {
    					return false;
    				}
    			}
    		}
    	}
    	return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key[][] = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		int lock[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		System.out.println(solution(key,lock));
	}

}
