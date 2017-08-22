package com.manoj.puzzle.stringPuzzles;

public class ReverseLine {
	public String reverseLine(String s){
		
		String[] str=s.split(" ");
		String result="";
		for(int i=str.length-1;i>=0;i--){
			result=result+str[i]+" ";
		}
		return result;
		}
public static void main(String[] args) {
	ReverseLine r=new ReverseLine();
	System.out.println(r.reverseLine("manoj is a bad boy"));
}
}
