package ch.epfl.data.plan_runner.ewh.data_structures;

import java.io.Serializable;

import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;

// T has to be Integer
public class ListTLongAdapter<T extends Comparable<T>> implements ListAdapter<T>, Serializable{
	private static final long serialVersionUID = 1L;

	private TLongArrayList _tList = new TLongArrayList();

	@Override
	public void set(int index, T t) {
		_tList.set(index, (Long)t);	
	}	
	
	// the invocation has a non-primitive type T as an argument
	@Override
	public void add(T t) {
		_tList.add((Long)t);
	}

	// the invocation expects T
	@Override
	public T get(int index) {
		return (T) (Long)_tList.get(index);
	}
	
	@Override
	public void remove(int index){
		_tList.remove(index);
	}	

	// works nicely if we spent most of the time in this method
	@Override
	public void sort() {
		_tList.sort();	
	}
	
	@Override
	public int size() {
		return _tList.size();
	}
	
	@Override
	public String toString(){
		return _tList.toString();
	}
}