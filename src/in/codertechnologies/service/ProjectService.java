package in.codertechnologies.service;

import java.util.List;

import in.codertechnologies.model.Project;

public interface ProjectService {

	void addProject(Project project);

	void deleteProjectById(int projectId);

	void updateProjectById(Project project);

	String findProjectNameById(int projectId);

	List<Project> findAllProject();

	Project findById(int projectId);

	void deleteAll();

}
