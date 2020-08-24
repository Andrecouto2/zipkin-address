package br.com.mastertech.couto.addressservice.client

import br.com.mastertech.couto.addressservice.model.Address
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "viacep", url = "https://viacep.com.br/")
interface CepClient {

    @GetMapping("/ws/{cep}/json/")
    fun getCep(@PathVariable cep: String): Address
}