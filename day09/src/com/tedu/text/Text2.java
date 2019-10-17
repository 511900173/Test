package com.tedu.text;

import java.util.Arrays;

public class Text2 {

	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9,11,13,15,17,19};
		int newArr[] = new int[arr.length];
		for(int i = 0; i< arr.length;i++){
		newArr[newArr.length-1-i]=arr[i];
		}
		System.out.println(Arrays.toString(newArr));

	}
}
