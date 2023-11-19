package ma.enset.comptecqrseventsoura3.commonsAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class CreateAccountRequestDto {
    private double initialBalance;
    private String currency;

}
