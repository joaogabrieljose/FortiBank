package devweek.pt.com.FortiBank.cadastro.model.entityTransactions.transactionDTO;

import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.EntityCustomer;

public record TransacaoRequest(EntityCustomer sender, EntityCustomer recipient, double valor) {
    
}
