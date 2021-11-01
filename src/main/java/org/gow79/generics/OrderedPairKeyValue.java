package org.gow79.generics;

import org.gow79.generics.interfaces.Pair;

public class OrderedPairKeyValue<K, V> implements Pair<K, V> {
	
	private K key;
    private V value;

    public OrderedPairKeyValue(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }

}
