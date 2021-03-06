package in.codertechnologies.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import in.codertechnologies.dao.ProjectDao;
import in.codertechnologies.model.Project;


public class ProjectDaoImpl implements ProjectDao{
	
	
	private JdbcTemplate jdbcTemplate;
	private String insertProject;
	private String updateProject;
	private String deleteProjectById;
	private String findProjectById;
	private String findAll;
	private String findById;
	private String deleteAllProject;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
	public void setInsertProject(String insertProject) {
		this.insertProject = insertProject;
	}


	public void setDeleteProjectById(String deleteProjectById) {
		this.deleteProjectById = deleteProjectById;
	}

	public void setUpdateProject(String updateProject) {
		this.updateProject = updateProject;
	}
	

	public void setFindProjectById(String findProjectById) {
		this.findProjectById = findProjectById;
	}


	public void setFindAll(String findAll) {
		this.findAll = findAll;
	}
	
	public void setFindById(String findById) {
		this.findById = findById;
	}


	public void setDeleteAllProject(String deleteAllProject) {
		this.deleteAllProject = deleteAllProject;
	}



	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		//String query="insert into project values('"+project.getProjectName()+"','"+project.getStartDate()+"','"+project.getEndDate()+"','"+project.getPriority()+"','"+project.getManager()+"','"+project.getProjectId()+"') ";
	    jdbcTemplate.update(insertProject,project.getProjectId(),project.getProjectName(),project.getStartDate(),project.getEndDate(),project.getPriority(),project.getManager());
	}



	@Override
	public void deleteProjectById(int projectId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(deleteProjectById,projectId);
	}



	@Override
	public void updateProjectById(Project project) {
		jdbcTemplate.update(updateProject,project.getProjectName(),project.getStartDate(),project.getEndDate(),project.getPriority(),project.getManager(),project.getProjectId());
	}



	@Override
	public String findProjectNameById(int projectId) {
		// TODO Auto-generated method stub
		return (String) jdbcTemplate.queryForObject(findProjectById, new Object[] {projectId},String.class);
	}

	@Override
	public List<Project> findAllProject() {
		// TODO Auto-generated method stub
		//List<String>data=jdbcTemplate.queryForList(query,String.class)
		return jdbcTemplate.query(findAll,new RowMapper<Project>()
				{

					@Override
					public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Project project=new Project();
						project.setProjectName(rs.getString(1));
						project.setStartDate(rs.getDate(2));
						project.setEndDate(rs.getDate(3));
						project.setPriority(rs.getInt(4));
						project.setManager(rs.getString(5));
						project.setProjectId(rs.getString(6));
						return project;
					}
					
				});
	}



	@Override
	public Project findById(int projectId) {
		// TODO Auto-generated method stub
	try {
	return jdbcTemplate.queryForObject(findById, new Object[] {projectId},new RowMapper<Project>() {
			
			@Override
			public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Project project=new Project();
				project.setProjectName(rs.getString(1));
				project.setStartDate(rs.getDate(2));
				project.setEndDate(rs.getDate(3));
				project.setPriority(rs.getInt(4));
				project.setManager(rs.getString(5));
				project.setProjectId(rs.getString(6));
				return project;
			}
		})	;	
	} catch (Exception e) {
		return null;	}	
	}


	@Override
	public void deleteAll() {
		
		jdbcTemplate.update(deleteAllProject);
		
	}
	
	

	

	

}
