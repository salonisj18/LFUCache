import java.util.Scanner;

public class LeastFrequentCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implementing Least Frequently Used cache");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the cache ");
		int size_of_cache = 3;
		LeastFrequentCacheImplementation cache = new LeastFrequentCacheImplementation(size_of_cache);
		int v1 = -1;
		cache.printCache();
		System.out.println("Adding 1");
		v1 = cache.setValue(1);
		System.out.println(" Is one added " + v1);
		System.out.println("Trying to get 4");
		v1 = cache.getValue(4);
		System.out.println("is 4 there ? " + v1);
		System.out.println("Adding 2");
		v1 = cache.setValue(2);
		cache.printCache();
		System.out.println(" Is two added " + v1);
		System.out.println("Adding 3");
		v1 = cache.setValue(3);
		System.out.println(" Is three added " + v1);
		System.out.println("Trying to get 4");
		v1 = cache.getValue(4);
		System.out.println("is 4 there ? " + v1);
		cache.printCache();
		System.out.println("Adding 3");
		v1 = cache.setValue(3);
		System.out.println(" Is three added " + v1);
		System.out.println("Adding 5");
		v1 = cache.setValue(5);
		System.out.println(" Is five added " + v1);
		cache.printCache();
		System.out.println("Adding 1");
		v1 = cache.setValue(1);
		System.out.println(" Is one added " + v1);
		cache.printCache();
		System.out.println("Trying to get 3");
		v1 = cache.getValue(3);
		System.out.println("is 3 there ? " + v1);
		cache.printCache();
		System.out.println("Adding 10");
		v1 = cache.setValue(10);
		System.out.println(" Is ten added " + v1);
		cache.printCache();
	}

}
