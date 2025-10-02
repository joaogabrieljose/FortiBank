package devweek.pt.com.FortiBank.cadastro.model.entityCustomer;

import java.util.List;
import java.util.UUID;

import devweek.pt.com.FortiBank.cadastro.model.entityTransactions.Transactions;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID )
    private UUID id;
    private String name;
    private String email;
    private double saldoInicio;
    private String password;

    @OneToMany(mappedBy = "sender")
    private List<Transactions> sentTransactions;

    @OneToMany(mappedBy = "recipient")
    private List<Transactions> recipientTransactions;

}
