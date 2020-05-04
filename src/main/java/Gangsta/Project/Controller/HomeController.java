package gangsta.project.Controller;

import gangsta.project.Model.Salesman;
import gangsta.project.Repository.SalesmanRepo;
import gangsta.project.Service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;
import java.util.Objects;

@Controller
public class HomeController
{
    @Autowired
    SalesmanService salesmanService;


    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("salesmanList", salesmanService.fetchAll());
        return "home/index";
    }

    @GetMapping("/create_user")
    public String createUser(Model model)
    {
        model.addAttribute("salesmanList", salesmanService.fetchAll());
        return "home/addUser";
    }

    @PostMapping("/Delete")
    public String deleteSalesman(WebRequest wr)
    {
        int id =Integer.parseInt(Objects.requireNonNull(wr.getParameter("salesman_id")));
        salesmanService.deleteSalesman(id);
        return "redirect:/";
    }

    @PostMapping("/Create_salesman")
    public String createSalesman(WebRequest wr)
    {
        String first_name = wr.getParameter("first_name");
        String last_name =wr.getParameter("last_name");
        String cpr = wr.getParameter("cpr");
        Salesman tempSalesman = new Salesman("DEFAULT", first_name, last_name, cpr);
        salesmanService.addSalesman(tempSalesman);

        return "redirect:/";
    }
}

