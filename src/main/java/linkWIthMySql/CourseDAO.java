package linkWIthMySql;

import javax.sql.DataSource;
import java.util.List;

public interface CourseDAO {

    public void setDataSource(DataSource ds);
    public List<Course> listCourses() throws Exception;
}
