import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeastFrequentCacheImplementation {
	
	private int max_size_of_cache;
	private Queue<Node> cache_queue;
	private Map<Integer, Node> cache_map;
	
	LeastFrequentCacheImplementation(int cache_size) {
		this.max_size_of_cache = cache_size;
		cache_queue = new PriorityQueue<Node>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				if(o1.getFrequency() >= o2.getFrequency()) {
					return 1;
				} else if(o1.getFrequency() < o2.getFrequency()) {
					return -1;
				}
				return 0;
			}
		});
		
		cache_map = new HashMap<Integer, Node>();
	}
	
	public int setValue(int key) {
		if(cache_queue.size() < max_size_of_cache) {
			if(cache_map.containsKey(key) ) {
				Node old_node = cache_map.get(key);
				old_node.setFrequency(old_node.getFrequency() + 1);
				cache_map.put(key, old_node);
			} else {
				Node new_node = new Node(key);
				cache_queue.add(new_node);
				cache_map.put(key, new_node);
			}
			return key;
		} else if (cache_queue.size() >= max_size_of_cache) {
			if(cache_map.containsKey(key)) {
				Node old_node = cache_map.get(key);
				old_node.setFrequency(old_node.getFrequency() + 1);
				cache_map.put(key, old_node);
				return key;
			} else {
				Node remove_node = cache_queue.peek();
				cache_map.remove(remove_node.getKey());
				cache_queue.poll();
				Node new_node = new Node(key);
				cache_queue.add(new_node);
				cache_map.put(key, new_node);
			}
		} 
		return -1;
	}
	
	public int getValue(int key) {
		if(cache_queue.isEmpty() || !cache_map.containsKey(key)) {
			return -1;
		}
		// Since we are not storing any value for now, returning frequency as the value of the key.
		Node old_node = cache_map.get(key);
		old_node.setFrequency(old_node.getFrequency() + 1);
		cache_map.put(key, old_node);
		return cache_map.get(key).getFrequency();
	}
	
	public void printCache() {
		System.out.println("Cache size is " + cache_queue.size());
		for (Map.Entry<Integer, Node> entry : cache_map.entrySet()) {
			System.out.println("Key is " + entry.getKey() + " frequence is " + entry.getValue().getFrequency());
		}
	}
}
