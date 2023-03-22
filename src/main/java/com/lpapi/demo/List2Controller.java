import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lpapi.demo.repository.LpUserRepository;
import java.util.List;
import com.lpapi.demo.entity.LpUser;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class List2Controller {

    @Autowired
    private LpUserRepository lpUserRepository;

    @GetMapping("/list2")
    public List<LpUser> getList() {
        return lpUserRepository.findAll();
    }
}