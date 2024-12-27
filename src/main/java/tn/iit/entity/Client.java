package tn.iit.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
@Table(name = "t_client")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column()
    private String nom;

    @Column()
    private String email;

    // Liste des IDs des comptes associés
    @ElementCollection
    @CollectionTable(name = "client_comptes", joinColumns = @JoinColumn(name = "client_id"))
    @Column(name = "compte_id")
    private List<Integer> compteIds;
}
