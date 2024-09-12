package com.board_back.board_back.common;

public interface ResponseCode {
    //HTTPS Status 200
    String SUCCESS = "SU";

    //HTTPS Status 400
    String VALIDATION_FAILED = "VF";
    String DUPLICATE_EMAIL = "DE";
    String DUPLICATE_NICKNAME = "DN";
    String DUPLICATE_TEL_NUMBER = "DT";
    String NOT_EXISTED_USER = "NU";
    String NOT_EXISTED_BOARD = "NB";

    //HTTPS Status 401
    String SIGN_IN_FAIL = "SF";
    String AUTHORIZATION_FAIL = "AF";

    //HTTPS Status 403
    String NO_PERMISSION = "NP";

    //HTTPS Status 500
    String DATABASE_ERROR = "DBE";
}
