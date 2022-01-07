package linkWIthMySql;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CourseJDBCTemplate extends GenericJDBCTemplate <Course> {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }



    public List<Course> get() {
        String SQL = "SELECT * FROM ListeCourses.listeCourses";
        List <Course> courses = jdbcTemplateObject.query(SQL, new CourseMapper());
        return courses;
    }

    public Course get (int id) {
        String SQL = "select * FROM ListeCourses.listeCourses where id=" + id;
        Course c = (Course) jdbcTemplateObject.queryForObject(SQL, new CourseMapper());
        return c;
    }

    public int add(Course c) {
        String SQL = "insert into ListeCourses.listeCourses (libelle, quantite) values (?, ?)";
        return (jdbcTemplateObject.update(SQL, c.getLibelle(), c.getQuantite()));
    }

    @Override
    public int delete(Course c) {
        String SQL = "DELETE From ListeCourses.listeCourses WHERE id=?";
        return (jdbcTemplateObject.update(SQL, c.getId()));
    }

    @Override
    public int update(Course c) {
        String SQL = "UPDATE ListeCourses.listeCourses SET libelle=?, quantite=? WHERE (id = ?);";
        return (jdbcTemplateObject.update(SQL, c.getLibelle(), c.getQuantite(), c.getId()));
    }


}
