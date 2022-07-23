package com.benny.classes

fun main() {
    var con1 = Contact("Milanoi", "0783938378")
    con1.printContact()
    var con2 = Contact("James","0111929393090", "MilanoiJaes@yahoo.com")
    con2.printContact()
}

class Contact {
    var name: String = ""
    var phone: String = ""
    var email: String = ""

    constructor(fname: String, tel: String) {
        name = fname
        phone = tel
    }

    constructor(fname: String, tel: String, mail: String) {
        name = fname
        phone = tel
        email = mail
    }

    fun printContact() {
        println(
            "Name: $name phone: $phone email: $email"
        )

    }
}
