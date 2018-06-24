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
import in.codertechnologies.service.ProjectService;


public class Client {


	public static void main(String[] args) {
		
		/*ProjectService projectServiceImpl = new ProjectServiceImpl(new ProjectHibernateDaoImpl());		
		projectServiceImpl.addProject(new Project());*/
		
		/*Resource resource = new ClassPathResource("applicationContext.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource); */
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//ProjectDao dao=(ProjectDao)ctx.getBean("projectDao"); 
		
		ProjectService projectService=(ProjectService) ctx.getBean(ProjectService.class);
		
		Project project=new Project();
		
		/*project.setProjectId("107");
		project.setProjectName("bookstore1");
		project.setStartDate(new Date(0));
		project.setEndDate(new Date(0));
		project.setPriority(65);
		project.setManager("ramraja");*/
	    
		//projectService.addProject(project); 
		
		//projectService.deleteProjectById(1110);
		
		//projectService.updateProjectById(project);
		
		/*String projectName=projectService.findProjectNameById(107);
		System.out.println(projectName);*/
		
		/*List<Project> li=new ArrayList<Project>();
		li=projectService.findAllProject();
		
		for(Project e:li)
		{
			System.out.println(e);
		}*/
		
		
		
	  
	 Project projec1=projectService.findById(106);
	  System.out.println(projec1);
	  
	  
	  
		//projectService.deleteAll();
		
		
		
		
		
	    
	}
}






