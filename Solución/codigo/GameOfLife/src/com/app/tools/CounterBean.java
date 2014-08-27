package com.app.tools;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CounterBean implements Serializable{

	private int count;

	String sal = "";
	boolean detener = false;
	private boolean stop = false;

	public boolean isDetener() {
		return detener;
	}

	public void setDetener(boolean detener) {
		this.detener = detener;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void increment() {
		count++;

	}

	public void detenerr() {
		detener = true;

		stop = true;

	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}