package com.example.project;

public class PQElement<T> {
    public T data;
    public int p;
	public int priority;

    public PQElement(T e, int prt){
        data=e;
        p=prt;
    }
}
