package com.bulider.improve;


//示例类，房子
public class MyHome {
	private String mDoor;
	private String mKitchen;
	private String mToilet;
	private String mBathroom;                    
	private String mStudy;
	
	public MyHome() {
		
	}
	
	
	


	public String getmDoor() {
		return mDoor;
	}
	public void setmDoor(String mDoor) {
		this.mDoor = mDoor;
	}
	public String getmKitchen() {
		return mKitchen;
	}
	public void setmKitchen(String mKitchen) {
		this.mKitchen = mKitchen;
	}
	public String getmToilet() {
		return mToilet;
	}
	public void setmToilet(String mToilet) {
		this.mToilet = mToilet;
	}
	public String getmBathroom() {
		return mBathroom;
	}
	public void setmBathroom(String mBathroom) {
		this.mBathroom = mBathroom;
	}
	public String getmStudy() {
		return mStudy;
	}
	public void setmStudy(String mStudy) {
		this.mStudy = mStudy;
	}
	@Override
	public String toString() {
		return "MyHome [mDoor=" + mDoor + ", mKitchen=" + mKitchen + ", mToilet=" + mToilet + ", mBathroom=" + mBathroom
				+ ", mStudy=" + mStudy + "]";
	}
}
