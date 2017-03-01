
public class Node<T, K, O>{	
	protected T category1;
	protected K category2;
	protected O category3;
	protected Node<T,K,O> right = null;
	protected Node<T,K,O> left = null;
	protected Node<T,K,O> down = null;
	
	public Node(T category1, K category2, O category3){
		this.category1 = category1;
		this.category2 = category2;
		this.category3 = category3;
	}
	
	public T getCategory1(){
		return category1;
	}
	
	public K getCategory2(){
		return category2;
	}
	
	public O getCategory3(){
		return category3;
	}
}
