package com.example.productapp.domain.use_case

import com.example.productapp.domain.util.ValidationResponse

class ValidateEmail {
    operator fun invoke(email :String): ValidationResponse {
       val regex = Regex("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}\$")

        if (regex.containsMatchIn(email)){
            return ValidationResponse(isValid = true,null)
        }else{
            return ValidationResponse(isValid = false,"Doesn't match .....")
        }
    }
}