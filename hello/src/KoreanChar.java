
public class KoreanChar {

	public static void main(String[] args) {
	    int unicode ;
		char character ;
		int i = 0;
		int s, y ;
		do {
			s = 0;
			do {
				y = 0;
				do {
					unicode = 0xAC00 + 28 * 21 * i + 28 * s + y;
					character = (char) unicode;
					System.out.print(character+ "");
					y+=1;
				}while(y<=27);
				s += 1;
			}while(s<=19);
			i += 1;
			System.out.print("\n--…--\n");
		}while(i<=18);
	}

}
