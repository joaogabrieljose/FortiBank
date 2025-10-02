package devweek.pt.com.FortiBank.cadastro.useCase.useCaseTransation;

import java.util.UUID;

import org.springframework.stereotype.Service;

import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.CustomerRepository;
import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.EntityCustomer;
import devweek.pt.com.FortiBank.cadastro.model.entityTransactions.Transactions;
import devweek.pt.com.FortiBank.cadastro.model.entityTransactions.TrnsactionsRepository;

@Service
public class UseCaseTransation {

    private TrnsactionsRepository transactionRepository;
    private CustomerRepository customerRepository;

    public UseCaseTransation(TrnsactionsRepository trnsactionsRepository, CustomerRepository customerRepository){
        this.transactionRepository = trnsactionsRepository;
        this.customerRepository = customerRepository;
    }
    

    public void transacao(UUID senderId, UUID reciptionId, double valor){

        if (senderId.equals(reciptionId) ) {
            throw new IllegalArgumentException("envia para outra conta / conta propria não e possivel");
        }

        EntityCustomer destinatario = this.customerRepository.findById(reciptionId).orElseThrow(()-> 
                new RuntimeException("destinatario não encontrado..."));

        EntityCustomer rementente = this.customerRepository.findById(senderId).orElseThrow(()-> 
                 new RuntimeException("rementente não encontrado...")
            );

            if (rementente.getSaldoInicio() < valor) {
                throw new IllegalArgumentException("saldo insuficiente");
            }

            rementente.setSaldoInicio(rementente.getSaldoInicio() - valor);
            destinatario.setSaldoInicio(destinatario.getSaldoInicio() + valor);

            Transactions transacao = new Transactions();
            transacao.setSender(rementente);
            transacao.setRecipient(destinatario);
            transacao.setValor(valor);

            this.customerRepository.save(rementente);
            this.customerRepository.save(destinatario);
            this.transactionRepository.save(transacao);

    }


}
