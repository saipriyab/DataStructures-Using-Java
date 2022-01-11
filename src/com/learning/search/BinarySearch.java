package com.learning.search;

public class BinarySearch {

	public static void main(String[] args) {
		int nums[]= {1,3,4,5,6,7,8};
		int target=17;
		int start=0,end=nums.length-1,mid=0,f=0;
		while(start<=end)
		{
			mid=start+((end-start)/2);
			if(nums[mid]==target)
			{
				System.out.println("element found at "+mid);
				f=1;
				break;
			}
			else if(target<nums[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		if(f==0)
		System.out.println("-1");
		

	}

}
