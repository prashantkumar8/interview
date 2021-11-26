package acko.testing.acko.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@NoArgsConstructor
@ToString
@JsonInclude(NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "developer")
public class Developer {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    long id;
    long teamId;
    String name;
    String phoneNumber;
}
