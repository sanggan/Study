package kakaoTest;

public class ploblem02 {
    public static String solution(String p) {
        String answer = "";
        if(p.compareTo("")==0) {
        	return answer;
        }
        
        String u ="";
        String v= "";
        int post=0;
        int last=0;
        for(int i=0; i<p.length(); i++) {
        	char tmp = p.charAt(i);
        	if(tmp == '(') {
        		post++;
        	}
        	else {
        		last++;
        	}
        	u+=tmp;
        	if(post == last) {

        		v = p.substring(i+1);

        		break;
        	}
        }
        String tmpU = "";
        String tmpV = solution(v);
        if(u.charAt(0) == '(') {
            tmpU = u;
            answer = tmpU+ tmpV;
        }
        else {
        	answer = '('+tmpV+')';
        	for(int i=1; i<u.length()-1;i++) {
        			if(u.charAt(i)=='(') {
        				tmpU += ')';
        			}
        			else {
        				tmpU += '(';
        			}
        	}
        	answer ='('+tmpV+')' + tmpU;
        }

        
        return answer;
    }
	public static void mdin(String[] args) {
		// TODO Auto-generated method stub
		int x[][] = new int[5][5];
		
		System.out.println(x[0][1]);
	}

}
