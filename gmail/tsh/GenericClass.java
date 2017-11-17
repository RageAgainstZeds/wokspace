package com.gmail.tsh;

public class GenericClass<T extends Number> {
	private T pole;

	public GenericClass(T pole) {
		super();
		this.pole = pole;
	}

	public GenericClass() {
		super();
	}

	public T getPole() {
		return pole;
	}

	public void setPole(T pole) {
		this.pole = pole;
	}

	@Override
	public String toString() {
		return "GenericClass [pole=" + pole + "]";
	}
	
	
}
