package uao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bao.AddLogic;
import dao.Addition;

public class AddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		Addition ad=(Addition)bf.getBean("add");
		int i=new AddLogic().add(ad.getA(),ad.getB());
		System.out.println(i);
	}

}
