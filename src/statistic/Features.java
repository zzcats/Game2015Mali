package statistic;

import java.util.Map;

public interface Features<T> {
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
