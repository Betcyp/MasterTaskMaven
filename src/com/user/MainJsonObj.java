package com.user;
import com.services.JsonObj;
import org.json.simple.JSONObject;

import com.databases.InsertDatabase;

public class MainJsonObj {
	public static void main(String[] args) {
		
		JsonObj obj=new JsonObj();
		@SuppressWarnings("unused")
		JSONObject jsonObject=obj.object();
		String file1=args[0];
		InsertDatabase id=new InsertDatabase();
		id.getConnection(file1);
		id.frameResponse(file1);
		
	}
}

