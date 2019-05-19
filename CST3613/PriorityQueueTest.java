import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class PriorityQueueTest {
	public static void main(String args[]){
		
		PriorityQueue<GeometricObject> GeoQueue = new PriorityQueue<GeometricObject>();
		 
		//Add objects to the PriorityQueue .
		GeoQueue.add(new Circle(0.5));
		GeoQueue.add(new Square(2));
		GeoQueue.add(new Square(5));
		GeoQueue.add(new Square(1));
		
		System.out.println("GeoQueue elements using Priority Queue method:");
		while (GeoQueue.size() > 0)
			System.out.println(GeoQueue.poll());
		
		//Create PriorityQueue  object.
		Queue priorityQueue  = new PriorityQueue();
 
		//Add objects to the PriorityQueue .
		priorityQueue.add("Gourav");
		priorityQueue.add("Neeraj");
		priorityQueue.add("Deepak");
		priorityQueue.add("Mohan");
		priorityQueue.add("Parmender");
 
		//Print the PriorityQueue object.
		System.out.println("HasPriorityQueue elements:");
		System.out.println(priorityQueue);
 
		//Print the PriorityQueue elements using iterator.
		Iterator iterator1=priorityQueue.iterator();
		System.out.println("PriorityQueue elements " +
				"using iterator:");
		while(iterator1.hasNext()){  
		   System.out.println(iterator1.next());  
		}
		
		//Print the head element of the PriorityQueue
		if (priorityQueue.peek() != null)
		{
			System.out.println("Head element: " 
					+ priorityQueue.element());
			System.out.println("Head element: " 
					+ priorityQueue.peek());
		}
		//Remove the head element of the PriorityQueue
		priorityQueue.poll();
		priorityQueue.remove();
 
		//Print the PriorityQueue object.
		System.out.println("HasPriorityQueue elements " +
				"after manipulation:");
		System.out.println(priorityQueue);
 
		//Print the PriorityQueue elements using iterator.
		Iterator iterator2=priorityQueue.iterator();
		System.out.println("PriorityQueue elements after " +
				"manipulation using iterator:");
		while(iterator2.hasNext()){  
		   System.out.println(iterator2.next());  
		}
		
	}
}