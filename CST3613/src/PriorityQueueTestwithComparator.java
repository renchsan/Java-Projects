import java.util.PriorityQueue;
import java.util.Queue;
 
public class PriorityQueueTestwithComparator {
	public static void main(String args[]){
		
		PriorityQueue<GeometricObject> GeoQueue = 
				new PriorityQueue<GeometricObject>(5,new GeometricObjectComparator());
		 
		//Add objects to the PriorityQueue .
		GeoQueue.add(new Circle(0.5));
		GeoQueue.add(new Square(2));
		GeoQueue.add(new Square(5));
		GeoQueue.add(new Square(1));
		
		System.out.println("GeoQueue elements using Priority Queue method:");
		while (GeoQueue.size() > 0)
			System.out.println(GeoQueue.poll());
		
	}
}