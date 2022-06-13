import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter your radius ");
		String radius = in.readLine();
		
		double pi = 3.1415926;
		System.out.println("Area = "+Integer.parseInt(radius)*Integer.parseInt(radius)*pi);
		System.out.println("Circumfrerence ="+ Integer.parseInt(radius)*2*pi);
		System.out.print("hello world");
		System.out.print("hello world2");
	}
}
