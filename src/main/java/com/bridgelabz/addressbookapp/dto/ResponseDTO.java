package com.bridgelabz.addressbookapp.dto;


import lombok.*;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
public class ResponseDTO {
    private  String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public ResponseDTO(String message) {

    }

}
