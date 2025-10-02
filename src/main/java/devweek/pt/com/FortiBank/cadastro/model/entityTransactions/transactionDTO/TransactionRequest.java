package devweek.pt.com.FortiBank.cadastro.model.entityTransactions.transactionDTO;

import java.time.LocalDateTime;
import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.EntityCustomer;

public record TransactionRequest(EntityCustomer sender, EntityCustomer recipient, double valor, LocalDateTime data ) {
    
}
