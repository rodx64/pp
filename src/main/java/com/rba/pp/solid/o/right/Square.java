package com.rba.pp.solid.o.right;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Square implements GeometricShape {

    private BigDecimal width;
    private BigDecimal height;

    @Override
    public BigDecimal calculateArea() {
        return width.multiply(height);
    }
}
