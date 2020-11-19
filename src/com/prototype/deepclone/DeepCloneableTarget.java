package com.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable , Cloneable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cloneName;
	private String cloneClass;
	
	public DeepCloneableTarget(String cloneName,String cloneClass) {
		this.cloneName=cloneName;
		this.cloneClass=cloneClass;
	}
	
	//因为该类的属性都是String ，因此我们这里使用默认的clone完成即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "DeepCloneableTarget [cloneName=" + cloneName + ", cloneClass=" + cloneClass + "]";
	}
	
	
}
