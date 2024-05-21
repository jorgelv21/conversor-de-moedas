package org.example.models;

public class Conversor {
    public String base_code;
    public String target_code;
    public double conversion_result;
    public double conversion_rate;
    public double valor;

    public Conversor(String base_code, String target_code, double valor) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.valor = valor;
    }

    public Conversor() {

    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(double conversion_result) {
        this.conversion_result = conversion_result;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Convesor{" +
                "base_code" + base_code +
                "target_code" + target_code +
                "conversion_result" + conversion_result +
                "conversion_rate" + conversion_rate +
                "}";
    }
}
