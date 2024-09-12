package com.board_back.board_back.common;

public interface ResponseMessage {
    //HTTPS Status 200
    String SUCCESS = "Success";

    //HTTPS Status 400
    String VALIDATION_FAILED = "Validation failed.";
    String DUPLICATE_EMAIL = "Duplicate email.";
    String DUPLICATE_NICKNAME = "Duplicate Nickname.";
    String DUPLICATE_TEL_NUMBER = "Duplicate Tel Number.";
    String NOT_EXISTED_USER = "This user does not exist";
    String NOT_EXISTED_BOARD = "This board does not exist";

    //HTTPS Status 401
    String SIGN_IN_FAIL = "Login information mismatch";
    String AUTHORIZATION_FAIL = "Authorization Failed";

    //HTTPS Status 403
    String NO_PERMISSION = "Do not have Permission";

    //HTTPS Status 500
    String DATABASE_ERROR = "Database Error";
}
