package devweek.pt.com.FortiBank.cadastro.model.entityTransactions.transactionDTO;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import devweek.pt.com.FortiBank.cadastro.model.entityTransactions.Transactions;

public class TransactionMapper {

    public static List<TransactionRequest> toTransactions(List<Transactions> entity){
        return entity.stream()
        .map(transaction -> new TransactionRequest(
                transaction.getSender(),
                transaction.getRecipient(),
                0,  
                transaction.getData()
        ))
        .collect(Collectors.toList());

    }
    
}
