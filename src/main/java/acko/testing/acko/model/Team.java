package acko.testing.acko.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@NoArgsConstructor
@ToString
@JsonInclude(NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    long id;
    String name;
}
