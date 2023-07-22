package com.example.eximap_nisarg.util

import io.grpc.Metadata

class Constants {

    companion object{
        private const val JWT_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJuZXB0dW5lIiwianRpIjoiTnpBME5EQXhOVEkxTUE9PSIsInN1YiI6ImRlZmF1bHQifQ._2-xTbhY5Qnp353V6wi0042OcycnK_6TJDdX99adUOE"

        private val jwtTokenKey: Metadata.Key<String> = Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER)
        private const val jwtTokenValue = "Bearer $JWT_TOKEN"

        val metadata = Metadata().apply {
            put(jwtTokenKey, jwtTokenValue)
        }

        const val TABLE_NAME = "post_details"

        const val REMOTE_KEY_TABLE_NAME = "remote_key"

        const val PAGE_SIZE = 15

    }

}