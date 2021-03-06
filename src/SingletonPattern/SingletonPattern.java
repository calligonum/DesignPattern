package SingletonPattern;

/**
 * @ClassName: SingletonPattern
 * @Description: 单例模式（Singleton Pattern）是 Java
 *               中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *               这种模式涉及到一个单一的类，该类负责创建自己的对象
 *               ，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 * @author lxp
 * @date 2016年8月3日 下午3:14:18
 */
public class SingletonPattern {
	public static void main(String[] args) {

		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		// 获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();

		// 显示消息
		object.showMessage();
	}
}
