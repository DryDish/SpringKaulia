package gangsta.project.Repository;

import gangsta.project.Model.Salesman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class salesmanRepo
{
    @Autowired
    JdbcTemplate template;
    public List<Salesman> fetchAll()
    {
        
    }
    public int addSalesman(Salesman salesman)
    {
        return -1;
    }

    public Salesman findSalesmanById(int id) 
    {
        return null;
    }

    public Boolean deleteSalesman(int id) 
    {
        return null;
    }

    public int updateSalesman(int id, Salesman newSalesman) 
    {
        return -1;
    }

}
