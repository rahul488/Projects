package com.org.FinalProject;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class Main {
	static List<EventDetails> list = new ArrayList<EventDetails>();
	CSVReader csv = null;
	boolean flag=true;
	public void storeDetails() {
		try {
			csv=new CSVReader(new FileReader("C:\\Users\\RAHUL KUMAR DAS\\Documents\\WindowEvent.csv"));
			
			String s[];
			
			while((s=csv.readNext())!=null) {
				if(flag) {
					flag=false;
					continue;
				}
				EventDetails ed=new EventDetails();
				ed.setLevel(s[0]);
				ed.setDateTime(s[1]);
				ed.setSource(s[2]);
				ed.setId(s[3]);
				ed.setTaskCategory(s[4]);
				list.add(ed);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<EventDetails> getDetails(int s) {
		List<EventDetails> res=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int s1=Integer.parseInt(list.get(i).getId());
			if(s==s1)
				res.add(list.get(i));
		}
		return res;
	}
}
