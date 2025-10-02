package devweek.pt.com.FortiBank.cadastro.controller.controllerCustomer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.dto.CustomerDTO;
import devweek.pt.com.FortiBank.cadastro.useCase.useCaseCustomer.CreateUseCaseCustomer;

@RestController
@RequestMapping("/auth")
public class CustomerController {

    private CreateUseCaseCustomer useCase;

    public CustomerController(CreateUseCaseCustomer useCase){
        this.useCase = useCase;
    }

    @PostMapping("/register")
    public String create (@RequestBody CustomerDTO dto){

        try {
            this.useCase.execute(dto);
            return "SUCESSO...";
            
        } catch (Exception e) {
            return "email expirado / usa outro email";
        }
        
    }
}
