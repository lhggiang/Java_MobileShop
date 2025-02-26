package vn.hoanggiang.mobileshop.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.hoanggiang.mobileshop.service.validator.RegisterChecked;

@RegisterChecked
@Data
public class RegisterDTO {
    @Size(min = 3, message = "FirstName must be at least 3 characters")
    private String firstName;

    private String lastName;

    @Email(message = "Invalid email", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    private String password;

    @Size(min = 3, message = "confirmPassword must be at least 3 characters")
    private String confirmPassword;
}
