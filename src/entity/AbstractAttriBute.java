package entity;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractAttriBute<T> implements Attribute<T>{
	protected Map<String, T> mp;
	public AbstractAttriBute(){
		mp = new HashMap<String,T>();
	}
	@Override
	public void output(String filepath) {
		// TODO Auto-generated method stub
		
	}
}
