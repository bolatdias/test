package com.example.demo.payload;


import com.example.demo.model.LimitType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
public class TransactionRequestDTO {
    @JsonProperty("account_from")
    private Long accountFrom;
    @JsonProperty("account_to")
    private Long accountTo;
    @JsonProperty("currency_shortname")
    private String currencyShortname;
    private BigDecimal sum;
    @JsonProperty("expense_category")
    private LimitType type;

    @JsonProperty("datetime")
    private OffsetDateTime datetime;
}