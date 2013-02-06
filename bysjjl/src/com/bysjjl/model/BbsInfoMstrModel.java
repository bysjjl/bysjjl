package com.bysjjl.model;

import java.util.List;

public class BbsInfoMstrModel {
	private List<BbsInfoMstr> bbsList;
	private int total;
	
	public List<BbsInfoMstr> getBbsList() {
		return bbsList;
	}
	public void setBbsList(List<BbsInfoMstr> bbsList) {
		this.bbsList = bbsList;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
