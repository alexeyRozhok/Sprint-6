package ru.sber.AddressBook.Model

data class CustomerModel(
    var firstName: String? = null,
    val lastName: String? = null,
    val middleName: String? = null,
    val phone: String? = null,
    var address: String? = null,
    val email: String? = null
)
