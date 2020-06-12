package part007;

/* ¼¿ÇÁ ³Ñ¹ö */
public class Q004673 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		boolean[] tf = new boolean[10001];
		
		for(int i = 0; i < tf.length; i++) {
			if(selfNum(i) <= 10000) {
				tf[selfNum(i)] = true;
			}
		}

		for(int i = 0; i <= 10000; i++) {
			if(tf[i] == false) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);

	}
	
	public static int selfNum(int n) {
		
		int dn = n;
		while(n > 0) {
			dn += n%10;
			n = n/10;
		}
		
		return dn;
	}

}
