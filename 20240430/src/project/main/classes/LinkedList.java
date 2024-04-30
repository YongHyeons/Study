package project.main.classes;

import java.util.function.*;

public class LinkedList<T> {
	class Node{
		public Node prev, next;
		T data;
		public T delete() {
			if(prev != null) prev.next = next;
			if(next != null) prev.prev = prev;
			return data;
		}	
		public Node(Node prev, Node next, T data) {
			this.prev = prev;
			this.next = next;
			this.data = data;
		}
	}
	
	private Node root, end;

	public LinkedList() { root = end = null; }
	
	public void pushFront(T data) {
		Node node = new Node(null, null, data);
		if(root != null) {
			node.next = root;
			root.prev = node;
		}
		else end = node;
		root = node;
	}
	
	public void pushBack(T data) {
		Node node = new Node(null, null, data);
		if(end != null) {
			node.prev = end;
			end.next = node;
		}
		else root = node;
		end = node;
	}
	
//	public void forEach(Action<T> action) {
//		Node now = root;
//		while(now != null) {
//			action.act(now.data);
//			now = now.next;
//		}
//	}
//	public void forEachR(Action<T> action) {
//		Node now = end;
//		while(now != null) {
//			action.act(now.data);
//			now = now.prev;
//		}
//	}
	
	public void forEach(Consumer<T> action) {
		Node now = root;
		while(now != null) {
			action.accept(now.data);
			now = now.next;
		}
	}
	public void forEachR(Consumer<T> action) {
		Node now = end;
		while(now != null) {
			action.accept(now.data);
			now = now.prev;
		}
	}
	
	public LinkedList<T> filter(Predicate<T> pred){
		LinkedList<T> filtering = new LinkedList<T>();
		Node now = root;
		while(now != null) {
			if(pred.test(now.data)) filtering.pushBack(now.data);
				now = now.next;
		}
		return filtering;
	}
	public <K> LinkedList<K> map(Function<T,K> func){
		LinkedList<K> map = new LinkedList<K>();
		Node now = root;
		while(now != null) {
				map.pushBack(func.apply(now.data));
				now = now.next;
		}
			return map;
	}
}