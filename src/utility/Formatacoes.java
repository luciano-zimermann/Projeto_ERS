package utility;

import java.text.DecimalFormat;

public class Formatacoes {

    public Double valorFormatadoVirgulaParaPonto(String valor) {

        String retorno = "";

        for (int i = 0; i < valor.length(); i++) {

            if (valor.charAt(i) == ',') {

                retorno += '.';

            } else {

                retorno += valor.charAt(i);

            }

        }

        return Double.parseDouble(retorno);

    }

    public String valorFormatadoReais(String valor) {

        String unidadeMonetaria = "R$";
        DecimalFormat formato = new DecimalFormat(unidadeMonetaria + " #,###,##0.00");

        return formato.format(valor);

    }

}
