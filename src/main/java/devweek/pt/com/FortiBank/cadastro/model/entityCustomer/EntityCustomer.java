package devweek.pt.com.FortiBank.cadastro.model.entityCustomer;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private String password;
    private double saldoInicio;
}
