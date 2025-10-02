package devweek.pt.com.FortiBank.cadastro.model.entityTransactions;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.EntityCustomer;

@Repository
public interface TrnsactionsRepository extends JpaRepository<Transactions, UUID>{

}
