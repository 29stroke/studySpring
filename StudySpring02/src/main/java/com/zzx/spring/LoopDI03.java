package com.zzx.spring;

public class LoopDI03 {
	private String name;
	private int number;
	private LoopDI01 loopDI01;
	public LoopDI03(String name, int number, LoopDI01 loopDI01) {
		super();
		System.out.println("create LoopDI03.");

		this.name = name;
		this.number = number;
		this.loopDI01 = loopDI01;
	}
	public LoopDI03() {
		super();
		System.out.println("create03.");
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
	public LoopDI01 getLoopDI01() {
		return loopDI01;
	}
	public void setLoopDI01(LoopDI01 loopDI01) {
		this.loopDI01 = loopDI01;
	}

}
