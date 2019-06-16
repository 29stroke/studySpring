package com.zzx.spring;

public class LoopDI02 {
	private String name;
	private int number;
	private LoopDI03 loopDI03;
	public LoopDI02(String name, int number, LoopDI03 loopDI03) {
		super();
		System.out.println("create LoopDI02.");

		this.name = name;
		this.number = number;
		this.loopDI03 = loopDI03;
	}
	public LoopDI02() {
		super();
		System.out.println("create02.");
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
	public LoopDI03 getLoopDI03() {
		return loopDI03;
	}
	public void setLoopDI03(LoopDI03 loopDI03) {
		this.loopDI03 = loopDI03;
	}

}
