package week13task;
import java.util.*;
public class ex2_PolyLine {

	private ArrayList<ex2_Point> points;

	public ex2_PolyLine() {
		points = new ArrayList<ex2_Point>();
	}

	public ex2_PolyLine(ArrayList<ex2_Point> points) {
		this.points = points;
	}

	public void appendPoint(int x, int y) {
		ex2_Point newPoint = new ex2_Point(x, y);
	      points.add(newPoint);
	   }


	public void appendPoint(ex2_Point point) {
		points.add(point);
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder("{");
	      for (ex2_Point aPoint : points) {
	          sb.append(aPoint.toString());
	      }
	      sb.append("}");
	      return sb.toString();
	   }

	public int getLength() {
		return 0;
	}
}
