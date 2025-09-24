package devweek.pt.com.FortiBank.cadastro.model.entityCustomer;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<EntityCustomer, UUID>{

    Optional<EntityCustomer> findByEmail(String email);
    
}
