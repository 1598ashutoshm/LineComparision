
public class LineComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1=2 , y1=3;
		int x2=6 , y2=4;
		int len1=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		int len_of_line1=(int)Math.sqrt(len1);
		System.out.println(len_of_line1);
		
		int p1=3 , q1=4;
		int p2=7 , q2=1;
		int len2=(p2-p1)*(p2-p1)+(q2-q1)*(q2-q1);
		int len_of_line2=(int)Math.sqrt(len2);
		System.out.println(len_of_line2);
		
		if(len_of_line1==len_of_line2) 
			System.out.println("Two lines are equal");
		else if(len_of_line1<len_of_line2)
			System.out.println("Line 2 greater than Line 1");
		else 
			System.out.println(" line1 greater than line 2");
	}
}
