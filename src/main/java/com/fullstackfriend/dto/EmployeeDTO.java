package com.fullstackfriend.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDTO {
    private String id;
    private String firstName;
    private String lastName;
}
