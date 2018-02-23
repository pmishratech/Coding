package com.codility.matrix;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class IntervalStartNext {
	public static void main(String[] args) {
		int[][] interval={{1,3}, {7,9}, {2,6}, {10,13}};
		
		Interval in = null;
		List<Interval> listInterval = new LinkedList<Interval>();
		for (int i = 0; i < interval.length; i++) {
				in=new Interval();
				in.setStartTime(interval[i][0]);
				in.setEndTime(interval[i][1]);
				listInterval.add(in);
		}
		
		System.out.println(listInterval);
		
		Collections.sort(listInterval, new Comparator<Interval>() {

			public int compare(Interval arg0, Interval arg1) {
				return arg0.getStartTime()-arg1.getStartTime();
			}
		});
		
		System.out.println(listInterval);
		
		for (int i = 1; i < listInterval.size(); i++) {
			if(listInterval.get(i-1).getEndTime()>listInterval.get(i).getStartTime()){
				System.out.println("yes");
				break;
			}
		}
	}
}

class Interval{
	private int startTime;
	private int endTime;
	
	public int getStartTime() {
		return startTime;
	}


	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}


	public int getEndTime() {
		return endTime;
	}


	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}


	@Override
	public String toString() {
		return "Interval [startTime=" + startTime + ", endTime=" + endTime
				+ "]";
	}
	
	
}
