package gangsta.project.Service;

import gangsta.project.Model.Salesman;
import gangsta.project.Repository.SalesmanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesmanService
{
    @Autowired
    SalesmanRepo salesmanRepo;

    public List<Salesman> fetchAll()
    {
        return salesmanRepo.fetchAll();
    }
    public int addSalesman(Salesman salesman)
    {
        return salesmanRepo.addSalesman(salesman);
    }

    public Salesman findSalesmanById(int salesman_id)
    {
        return salesmanRepo.findSalesmanById(salesman_id);
    }

    public Boolean deleteSalesman(int salesman_id)
    {
        return salesmanRepo.deleteSalesman(salesman_id);
    }

    public int updateSalesman(int salesman_id, Salesman newSalesman)
    {
        return salesmanRepo.updateSalesman(salesman_id, newSalesman);
    }
}
