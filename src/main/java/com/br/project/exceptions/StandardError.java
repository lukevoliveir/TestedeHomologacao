package  com.br.project.exceptions;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

/**
 * Classe que será retornada para a tela contendo os erros de aplicação
 * 
 * @author Lucas Vale
 * @since 07/06/2019 
 * @version 1.0.0
 *
 */

@Data
public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer status;
    private LocalDateTime dateTime;
	private String message;
	private String messageError;
	private Integer code;
	private Exception exception;
	
	
    public StandardError(Integer status, LocalDateTime dateTime, String message, String messageError, Integer code, Exception exception) {
		super();
		this.status = status;
		this.dateTime = dateTime;
		this.message = message;
		this.messageError = messageError;
		this.code = code;
		this.exception = exception;
	}

    public String getDateTime() {
        if (dateTime == null) {
            return null;
        }

        return dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
