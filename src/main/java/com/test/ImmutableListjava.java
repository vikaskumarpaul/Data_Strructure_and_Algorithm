package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class ImmutableListjava
{
	public static void main(String[] args)
	{
		List<String> l1 = new ArrayList<>();
		l1.add("abdc");
		l1.add("awg");
		l1.add("aweg");
		l1.add("tyil");
		
		Collections.unmodifiableList(l1);
	}
}
