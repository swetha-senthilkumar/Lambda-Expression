package com.capgemini.lambda2;

@FunctionalInterface
public interface Max {
	public int max(int num1,int num2);
}

// Runnable  -> public void run()
// Comparable -> public int compareTo(Object obj)
// Comparator -> public int compare(Object obj1, Object obj2)
