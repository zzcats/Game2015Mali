package statistic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class AbstractFeatures<T>{
	protected Map<String, T> mp;
	public AbstractFeatures(){
		mp = new HashMap<String,T>();
	}
	/**
	 * 获取map
	 * @return
	 */
	public abstract Map<String, T> getMap();
	/**
	 * 输出到文件
	 * @param filepath 文件路径
	 */
	public void output(String filepath) {
		// TODO Auto-generated method stub
		File file = new File(filepath);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			for(Entry<String, T> en : mp.entrySet()){
				out.write(en.getKey()+","+en.getValue());
				out.newLine();
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
