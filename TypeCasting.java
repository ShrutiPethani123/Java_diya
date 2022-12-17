/*

Type casting 

1. implicite
2. Explicite

Implicite -->     byte -> short -> int -> long -> float -> double

Explicite -->     byte <- short <- int <- long <- float <- double

*/

class TypeCasting{

	public static void main(String args[])
	{
			// byte b=45;
			// float f = b;
			// System.out.println(f);

			// long l=5734736;
			// float s = l;
			// System.out.println(s);

			// double d=35.4634;
			// short t = (byte)d;
			// System.out.println(t);

			int d=56;
			float f = d;
			System.out.println(f);

			double h = 130.34234;
			// short s = (short)h;
			short s = (byte)h;
			System.out.println(s);


	}

}