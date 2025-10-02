package devweek.pt.com.FortiBank.cadastro.model.entityTransactions;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrnsactionsRepository extends JpaRepository<Transactions, UUID>{

}
