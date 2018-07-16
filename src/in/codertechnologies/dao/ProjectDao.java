package in.codertechnologies.dao;

import java.util.List;

import in.codertechnologies.model.Project;

public interface ProjectDao {

	public void addProject(Project project);
	
	public void deleteProjectById(int projectId);
	
	public void updateProjectById(Project project);
	
	public String findProjectNameById(int projectId);
	
	public List<Project> findAllProject();
	
	public Project findById(int projectId);
	
	public void deleteAll();
	
	
	
	
}
