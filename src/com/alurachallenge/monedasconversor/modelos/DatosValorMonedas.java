package com.alurachallenge.monedasconversor.modelos;

import com.google.gson.annotations.SerializedName;

public record DatosValorMonedas(
        @SerializedName("base_code")
        String baseCode,
        @SerializedName("target_code")
        String targetCode,
        @SerializedName("conversion_rate")
        float conversionRate
) {
}
