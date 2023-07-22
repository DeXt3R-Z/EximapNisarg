package com.example.eximap_nisarg.util


sealed class ResponseStates<D>(var list: D? = null, val message: String?= null) {
    class LOADING<D>: ResponseStates<D>()
    class SUCCESS<D>(list: D?): ResponseStates<D>(list = list)
    class ERROR<D>(msg: String): ResponseStates<D>(message = msg)
}
