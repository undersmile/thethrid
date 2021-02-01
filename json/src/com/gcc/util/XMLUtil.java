package com.gcc.util;

import java.io.FileWriter;
import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XMLUtil {
	public List<Element> stuElements;
	Document doc ;
	public List<Element> getElements(Object obj) {
		try (InputStream is = obj.getClass().getResourceAsStream("/note.xml")) {
			SAXReader reader = new SAXReader();
			 doc = reader.read(is);
			Element rootElement = doc.getRootElement();
			stuElements = rootElement.elements("stu");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stuElements;
	}

	public void writexml(Object obj) throws Exception {
		
			XMLWriter writer = new XMLWriter(new FileWriter("E:\\myjava\\json\\src\\note.xml"));
			writer.write(doc);
			writer.close();
		
	}
}
