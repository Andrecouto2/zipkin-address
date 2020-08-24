package br.com.mastertech.couto.addressservice.controller

import br.com.mastertech.couto.addressservice.client.CepClient
import br.com.mastertech.couto.addressservice.model.Address
import br.com.mastertech.couto.addressservice.service.AddressService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AddressController {

    @Autowired
    private lateinit var addressService: AddressService

    @GetMapping("/cep/{cep}")
    fun getAddressFromZipCodeV1(@PathVariable cep: String): ResponseEntity<Address> {
        return ResponseEntity.ok(addressService.getCep(cep))
    }
}