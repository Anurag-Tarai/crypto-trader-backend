package com.tarai.crypto_trader_backend.model;

import com.tarai.crypto_trader_backend.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {
    private boolean isEnable = false;
    private VerificationType sendTo;
}
