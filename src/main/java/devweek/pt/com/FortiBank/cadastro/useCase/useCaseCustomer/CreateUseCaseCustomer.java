package devweek.pt.com.FortiBank.cadastro.useCase.useCaseCustomer;

import org.springframework.stereotype.Service;

import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.CustomerRepository;
import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.EntityCustomer;
import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.dto.CustomerDTO;
import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.dto.CustomerMapper;

@Service
public class CreateUseCaseCustomer {

    private CustomerRepository customerRepository;

    public CreateUseCaseCustomer(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    public void execute(CustomerDTO customerDTO){

        this.customerRepository.findByEmail(customerDTO.email()).ifPresent(user ->{
            throw new IllegalArgumentException("já existe conta com esse email: ");
        });

        EntityCustomer entity = CustomerMapper.tCustomer(customerDTO);
        this.customerRepository.save(entity);
    }


}
