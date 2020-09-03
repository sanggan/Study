package kakaoTest;

public class ploblem01 {
	   public static int solution(String s) {
	        int answer = s.length();
	        for(int i=1; i<=s.length()/2; i++) {
	        	String solu = "";
	        	int curr = 1;
	        	String temp = "";
	        	String next = "";
	        	for(int j=0; j<s.length()-i; j+=i) {
	        		temp = s.substring(j, j+i);
	        		int index = 0;
	        		if(j+i+i >s.length()) {
	        			index = s.length();
	        		}
	        		else {
	        			index = j+i+i;
	        		}
	        		next = s.substring(j+i,index);
	        		if(temp.compareTo(next)==0) {
	        			curr++;
	        		}
	        		else {
	        			if(curr == 1) {
	        				solu += temp;
	        			}
	        			else {
	        				solu += curr;
	        				solu += temp;
	        			}
	        			curr=1;
	        		}

	        	}
        		if(curr ==1 ) {
        			solu+=next;
        		}
        		else {
        			solu+=curr;
        			solu+=temp;
        		}
	        	answer = Math.min(answer, solu.length());
	        }
	        return answer;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("abcabcabcabcdededededede"));
	}

}
