package devweek.pt.com.FortiBank.cadastro.model.entityTransactions;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import devweek.pt.com.FortiBank.cadastro.model.entityCustomer.EntityCustomer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_transactions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private EntityCustomer sender;

    @ManyToOne
    @JoinColumn(name = "recipient_id", nullable = false)
    private EntityCustomer recipient;
    private double valor;

    @CreationTimestamp
    private LocalDateTime data; 
    
}
