package com.kh.chap04_map.part03_clone.run;

import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public class HashMapRun <K, V>{
	private Entry<K, V>[] table;
	private int capacity; //객체배열의 크기로써 사용
	private int size; //객체배열 내부의 초기화된 객체의 수.
	
	class Entry <K, V>{
		K key;
		V value;
		
		Entry<K, V> next;
		
		public Entry(K key, V value, Entry<K,V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	//객체 생성시 반드시 객체배열의 크기를 지정
	public HashMapRun(int capacity) {
		this.capacity = capacity;
		this.table = new Entry[capacity];
	}
	
	public int getIndex(String key) {
		//매개변수로 전달받은 key값을 hashCode()로 변환시킨후
		// 객체의 총 저장공간 수 (capacity)만큼 나눈 나머지 결과값을 반환하는 함수.
		int hash = key.hashCode();
		/*
		 	저장공간이 10이라면?
		 	113355 % 10 == 5번 인덱스
		 	12345678 % 10 == 8번 인덱스
		 	777777778 % 10 == 8번 인덱스
		 */
		return Math.abs(hash) % capacity;
	}
	public void put(K key, V value) {
		int index = getIndex(key);
		
		if(table[index] == null) {
			table[index] = new Entry<>(key,value,null);
		}
		//이미 해당 위치에 값이 있는 경우.
		// 1. 완전 같은 key값을 사용한 경우
		//	- key값 중복으로 현재 들어온 value로 인덱스 위치의 값을 덮어씌우기.
		if(table[index].key.equals(key)) {
			table[index].value = value;
		}else {
			//2. key은 다르지만 hash값이 우연히 일치한 경우
//			table[index].next = new Entry<>(key,value,null);
		
			Entry<K,V> next = table[index];
			
			while (true) {
				// 다음으로 뽑은 entry의 key값이 현재 전달받은 key값과 동일한 경우(중복)
				if (next.key.equals(key)) {
					next.value = value;
					return;
				}

				if (next.next == null) {
					next.next = new Entry<>(key, value, next);
					break;
				} // 현재 entry가 마지막 entry인 경우
				if (next.next == null) {
					next.next = new Entry<>(key, value, null);
					break;
				}
				next = next.next;
			}

		}

		size++;

	}
	
	public V get(K key) {
		int index = getIndex(key);
		Entry<K, V> entry = table[index];

		while (true) {
			if (entry.key.equals(key)) {
				return entry.value;
			}
			if(entry.key.equals(key)) {
				return entry.value;
			}
			entry = entry.next;
		}
	}
	public boolean containsKey(String key) {
		int index = getIndex(key);
		Entry<K,V> entry = table[index];
		
		if(entry == null) {
			return false;
		}
		
		do {
			if(entry.key.equals(key)) {
				return true;
			}
			entry = entry.next;
		}while(entry != null);
	}
	
	public void remove(String key) {
		int index = getIndex(key);
		Entry<K ,V> entry = table[index];
		Entry<K, V> prev = null;
		
		//접근시 내부의 값이 null이라면 메소드 종료;
		do {
			if(entry == null) {
				return;
			}
			
			if(entry.key.equals(key)) {
				if(table[index] == entry) {
					table[index] = entry.next;
				}else {
					prev.next = entry.next;
				}
			}
			prev = entry;
			entry = entry.next;
		}while(entry != null);
		

		//객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
		// 동일하다면 현재 Node 삭제.
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		
	}
}
