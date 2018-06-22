package in.codertechnologies.test;




import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.codertechnologies.dao.ProjectDao;
import in.codertechnologies.daoImpl.ProjectHibernateDaoImpl;
import in.codertechnologies.model.Project;


public class Client {


	public static void main(String[] args) {
		
		/*ProjectService projectServiceImpl = new ProjectServiceImpl(new ProjectHibernateDaoImpl());		
		projectServiceImpl.addProject(new Project());*/
		
		/*Resource resource = new ClassPathResource("applicationContext.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource); */
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		ProjectDao dao=(ProjectDao)ctx.getBean("projectDao"); 
		
		Project project=new Project();
		
		/*project.setProjectId("107");
		project.setProjectName("digiMarketing");
		project.setStartDate(new Date(0));
		project.setEndDate(new Date(0));
		project.setPriority(50);
		project.setManager("kiran");*/
	    
		//dao.addProject(project); 
		
		//dao.deleteProjectById(10);
		
		//dao.updateProjectById(project);
		
		/*String projectName=dao.findProjectNameById(105);
		System.out.println(projectName);*/
		
		List<Project> li=new ArrayList<Project>();
		li=dao.findAllProject();
		System.out.println(li);
		Iterator<Project> p=li.iterator();
		
		while(p.hasNext())
		{
			System.out.println(p.next());
		}
		
		
		
		
		
		
	    
	}
}






