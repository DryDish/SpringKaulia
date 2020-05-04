package gangsta.project.Repository;

import gangsta.project.Model.Salesman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SalesmanRepo
{
    @Autowired
    JdbcTemplate template;

    public List<Salesman> fetchAll()
    {
        String query ="SELECT * FROM salesman;";
        RowMapper<Salesman> rm_salesman = new BeanPropertyRowMapper<>(Salesman.class);
        return template.query(query,rm_salesman);
    }
    public int addSalesman(Salesman salesman)
    {
        return -1;
    }

    public Salesman findSalesmanById(int salesman_id)
    {
        return null;
    }


    public Boolean deleteSalesman(int salesman_id)
    {
        String query = "DELETE FROM salesman WHERE salesman_id = ?;";
        Boolean deleted = template.update(query, salesman_id) <0;
        return deleted;
    }

    public int updateSalesman(int salesman_id, Salesman newSalesman)
    {
        return -1;
    }

}
