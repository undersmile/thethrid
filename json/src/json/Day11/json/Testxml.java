package json.Day11.json;

import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Testxml {
	public static void main(String[] args) {
		// readNote();
		readNote2();
	}

	private static void readNote() {

		try (InputStream is = Testxml.class.getResourceAsStream("/note2.xml")) {
			SAXReader reader = new SAXReader();
			// 获取文件对象
			Document doc = reader.read(is);
			// 获取根节点元素
			Element rootElement = doc.getRootElement();

//			// 获取子节点元素
//			Element element = rootElement.element("masterpiece");
//			Element element2 = element.element("name");
//			// 通过子节点元素获取文本信息
//		    String text = element2.getText();
//			System.out.println("text:" + text);
//			List<Element> list = new ArrayList<>();
//			list = element.elements();
//			for (Element e : list) {
//				System.out.println(e.getName()+":"+e.getText());
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readNote2() {
		try (InputStream is = Testxml.class.getResourceAsStream("/note2.xml")) {
			SAXReader reader = new SAXReader();
			// 获取文件对象
			Document doc = reader.read(is);
			// 获取根节点元素
			Element rootElement = doc.getRootElement();
			readElements(rootElement);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void readElements(Element element) {
		// 获取所有的子节点放入list
		List<Element> elements = element.elements();
		if (elements.size() > 0) {
			// 下面还有子节点
			System.out.println(element.getName() + "子节点下还有节点");
			for (Element element2 : elements) {
				readElements(element2);
			}
			System.out.println("***");
		} else {
			System.out.println(element.getName() + ":" + element.getText());
		}

	}
}
