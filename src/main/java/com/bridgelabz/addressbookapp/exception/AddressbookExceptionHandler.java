package com.bridgelabz.addressbookapp.exception;

import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;


@ControllerAdvice
public class AddressbookExceptionHandler {

    /*
     * @method: Handle the User exception.
     *
     */

    @ExceptionHandler(AddressbookException.class)
    public ResponseEntity<ResponseDTO> handleAddressBookException(AddressbookException exception) {
        ResponseDTO responseDTO = new ResponseDTO("Exception while processing REST Requests", exception.getMessage());
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }

    /*
     * @method: If any Field is not match validation condition it will Handle and show proper exception message.
     *
     */

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException (MethodArgumentNotValidException exception) {
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errMsg = errorList.stream()
                .map(objErr -> objErr.getDefaultMessage())
                .collect(Collectors.toList());
        ResponseDTO responseDTO = new ResponseDTO("Exception while processing REST Request.", errMsg);
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }


    /**
     * @metohd for handling the expeotion if user try to add duplicate person.
     * @param exception
     * @return
     */

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ResponseDTO> handleDataIntegrityViolationException (DataIntegrityViolationException exception){
        ResponseDTO responseDTO = new ResponseDTO("Duplicate Data", exception.getMessage());
        return new ResponseEntity<>(responseDTO, HttpStatus.LOCKED);
    }
}
