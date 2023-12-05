package com.example.apiportsadapters.core;


/**
 * { Api endpoints }
 * This class provides a way to centralize all the endpoints of the application.
 */
public record Api() {

    public static final String VERSION = "/v1";
    public static final String USER = VERSION + "/user";

    /**
     * { User endpoints }
     * /{version}/user/{endpoint}
     */
    public record User() {
        /**
         * Endpoint: /{version}/user/register
         */
        public static final String REGISTER = "/register";

    }
}
