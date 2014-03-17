/**
 * 
 */
package spring.collections;

import java.util.List;

/**
 * @author Home
 *
 */
public class Triangle {
	private List<Point> points;

	/**
	 * @return the points
	 */
	public List<Point> getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw(){
		for(Point point:points){
			System.out.println("PointA=("+point.getX()+","+point.getY()+")");
		}
	}
}
