package nextstep.subway.domain.auth.application;

import nextstep.subway.global.error.ErrorCode;
import nextstep.subway.global.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class AuthorizationException extends BusinessException {

    public AuthorizationException() {
        super(ErrorCode.NOT_AUTHORIZATION);
    }
}
