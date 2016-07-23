package com.igate.bean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bean {
private String name;
private String id;
private Map<String, String> answers;
private Address addr;



public Bean(String name, String id, Map<String, String> answers, Address addr) {
	super();
	this.name = name;
	this.id = id;
	this.answers = answers;
	this.addr=addr;
}



public void dispAll()
{
	System.out.println(id +" "+ name);
	System.out.println("Address is" + addr);
	System.out.println("Answers are");
	
	Set<Entry<String, String>> st =answers.entrySet();
	/*Iterator<Entry<String, String>> itr= st.iterator();
	while(itr.hasNext())
	{
		Entry<String, String> ent =itr.next();
		System.out.println("Answers : "+ent.getKey()+"Posted by : " +ent.getValue());
		
	}*/
	for(Map.Entry<String, String> me : st)
	{
		System.out.println("Roll No : "+me.getKey()+"  Name :"+me.getValue());
	}

}
}
