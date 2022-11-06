package InputF;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import Admin.Scores;
import School.Students;

import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.Hashtable;

public class FileInput {
	public static Hashtable<String, Students> manageStudent_;

	public FileInput() {
		manageStudent_ = new Hashtable<String, Students>();
	}


	public Hashtable<String, Students> ReadFileInput() {
		
		try {
			
			File file = new File("./APP/src/InputF/file.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);

			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("student");

			for (int i = 0; i < nodeList.getLength(); ++i) {
				Node node = nodeList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					

					Element tElement = (Element)node;
					String name_ = tElement.getElementsByTagName("name").item(0).getTextContent();
					String id_ = tElement.getElementsByTagName("id").item(0).getTextContent();
					String date_of_birth_ = tElement.getElementsByTagName("date_of_birth").item(0).getTextContent();
					String address_ = tElement.getElementsByTagName("address").item(0).getTextContent();
					String phone_ = tElement.getElementsByTagName("phone").item(0).getTextContent();
					String age_ = tElement.getElementsByTagName("age").item(0).getTextContent();
					String gender_ = tElement.getElementsByTagName("gender").item(0).getTextContent();
					String grade_ = tElement.getElementsByTagName("grade").item(0).getTextContent();

					Students student_ = new Students(name_, id_, date_of_birth_, address_, phone_, Integer.parseInt(age_), gender_, grade_, new Scores());
					
					// System.out.println(manage._ManageStudent.get("A1").showInfor());
					manageStudent_.put(student_.getId(), student_);
				}
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return manageStudent_;
	}
}
