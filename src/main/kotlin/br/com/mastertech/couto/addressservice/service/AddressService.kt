package br.com.mastertech.couto.addressservice.service

import br.com.mastertech.couto.addressservice.client.CepClient
import br.com.mastertech.couto.addressservice.model.Address
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AddressService {

    @Autowired
    private lateinit var cepClient: CepClient

    fun getCep(cep: String): Address {
        return cepClient.getCep(cep)
    }

}