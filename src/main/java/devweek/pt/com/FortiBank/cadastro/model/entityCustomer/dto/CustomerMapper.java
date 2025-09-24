package devweek.pt.com.FortiBank.cadastro.model.entityCustomer.dto;

import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.EntityCustomer;

public class CustomerMapper {

    public static EntityCustomer tCustomer(CustomerDTO dto){

        EntityCustomer entity = new EntityCustomer();
        entity.setName(dto.name());
        entity.setEmail(dto.email());
        entity.setSaldoInicio(dto.saldoInicio());

        return entity;
    }
    
}
