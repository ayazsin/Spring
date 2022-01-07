package linkWIthMySql;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseMapper implements RowMapper<Course> {

    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
        Course c = new Course();
        c.setLibelle(rs.getString("libelle"));
        c.setQuantite(rs.getInt("quantite"));
        return c;
    }


}
