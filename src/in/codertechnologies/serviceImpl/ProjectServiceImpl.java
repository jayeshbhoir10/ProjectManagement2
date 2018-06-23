package in.codertechnologies.serviceImpl;

import java.util.List;

import in.codertechnologies.dao.ProjectDao;
import in.codertechnologies.model.Project;
import in.codertechnologies.service.ProjectService;

public class ProjectServiceImpl implements ProjectService{

	private ProjectDao projectDaoImpl;
	
	
	
	
	public void setProjectDaoImpl(ProjectDao projectDaoImpl) {
		this.projectDaoImpl = projectDaoImpl;
	}

	@Override
	public void addProject(Project project) {
		projectDaoImpl.addProject(project);
		
	}

	@Override
	public void deleteProjectById(int projectId) {
		projectDaoImpl.deleteProjectById(projectId);
		
	}

	@Override
	public void updateProjectById(Project project) {
		projectDaoImpl.updateProjectById(project);
		
	}

	@Override
	public String findProjectNameById(int projectId) {
		// TODO Auto-generated method stub
		return projectDaoImpl.findProjectNameById(projectId);
	}

	@Override
	public List<Project> findAllProject() {
		// TODO Auto-generated method stub
		return projectDaoImpl.findAllProject();
	}

	@Override
	public Project findById(int projectId) {
		// TODO Auto-generated method stub
		return projectDaoImpl.findById(projectId);
	}

	@Override
	public void deleteAll() {
		projectDaoImpl.deleteAll();
		
	}

}
