package org.craftedsw.domain;

import java.text.DecimalFormat;

public class Amount {

    // Método para dar formato a las variables o resultados de tipo double o float
    private DecimalFormat decimalFormat = new DecimalFormat("#.00");

    private int value;

    public Amount(int value) {
        this.value = value;
    }

    public static Amount amountOf(int value) {
        return new Amount(value);
    }

    // Método plus que recibe el parámetro otherAmount y lo suma al value, añadiendo más créditos
    public Amount plus(Amount otherAmount) {
        return amountOf(this.value + otherAmount.value);
    }

    // Método isGreaterThan con parámetro otherAmount para indicar si el valor es mayor que el parámetro ingresado
    public boolean isGreaterThan(Amount otherAmount) {
        return this.value > otherAmount.value;
    }

    // Método absoluteValue que retorna el valor absoluto de value
    public Amount absoluteValue() {
        return amountOf(Math.abs(value));
    }

    public String moneyRepresentation() {
        return decimalFormat.format(value);
    }

    public Amount negative() {
        return amountOf(-value);
    }

    @Override
    public boolean equals(Object obj) {
        Amount other = (Amount) obj; // Casteo de la variable tipo Object obj para compararla con el value
        if (value != other.value)
            return false;
        return true;
    }
}
