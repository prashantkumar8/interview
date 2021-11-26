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
@Table(name = "dead_consumer_event")
public class Task {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private Integer clientId;
    private Integer jobId;
    private Integer entityId;
    private Integer entityTypeId;
    private String topicName;
    private String entityObjectJson;
}
