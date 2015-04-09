package entity;

import java.util.Map;
/**
 * 属性类接口
 * @param <T> information
 * @author v11
 */
public interface Attribute<T> {
	/**
	 * 获取map
	 * @return
	 */
	Map<String, T> getMap();
	/**
	 * 输出到文件
	 * @param filepath 文件路径
	 */
	void output(String filepath);
}
