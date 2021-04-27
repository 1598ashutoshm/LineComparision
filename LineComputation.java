
public class LineComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x1=4 , y1=2;
		float x2=2 , y2=5;
		double len_of_line=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		int len=(int)Math.sqrt(len_of_line);
		System.out.println(len);
	}
}
