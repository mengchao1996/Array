/**   
 * Copyright © 2019 Java1706D. All rights reserved.
 * 
 * @Title: DemoArray.java 
 * @Prject: Demo18
 * @Package: com.mc.test 
 * @Description: TODO
 * @author:yh
 * @date: 2019年12月20日 上午8:15:05 
 * @version: V1.0   
 */
package com.mc.test;

import java.util.Arrays;

/** 
 * @ClassName: DemoArray 
 * @Description: TODO
 * @author:MengChao
 * @date: 2019年12月20日 上午8:15:05  
 */
public class DemoArray {
	
	public static void main(String[] args) {
		//定义两个数组
		int ary1[]= {3,6,7,8};
		int ary2[]= {1,2,4,5};
		
		//排序定义的两个数组
		Arrays.sort(ary1);
		Arrays.sort(ary2);
		
		//合并数组
		int list[]=new int[ary1.length+ary2.length];
		
		System.arraycopy(ary1,0,list,0,ary1.length);
		System.arraycopy(ary2, 0,list,ary1.length,ary2.length);
		
		
		//调用工具类
		MergeSort.sort(list,0,list.length-1);
		
		//使用foreh循环遍历
		for (int i : list) {
			System.out.print(i);
		}
		
	}
	
	
}
