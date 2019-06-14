package com.zzx.spring;

public class LoopDI01 {
	private String name;
	private int number;
	private LoopDI02 loopDI02;
	public LoopDI01(String name, int number, LoopDI02 loopDI02) {
		super();
		System.out.println("create LoopDI01.");

		this.name = name;
		this.number = number;
		this.loopDI02 = loopDI02;
	}
	public LoopDI01() {
		super();
		System.out.println("create01.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public LoopDI02 getLoopDI02() {
		return loopDI02;
	}
	public void setLoopDI02(LoopDI02 loopDI02) {
		this.loopDI02 = loopDI02;
	}

}
