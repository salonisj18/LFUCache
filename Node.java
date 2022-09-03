
public class Node {
	
	private int key;
	private int frequency;
	
	Node(int key) {
		this.key = key;
		this.frequency = 1;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	
}
