package utility;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public String dataFormatada() {

        Date data = new Date();
        
        SimpleDateFormat Formatador = new SimpleDateFormat("yyyy-MM-dd");

        String dataFormatada = Formatador.format(data);

        return dataFormatada;

    }

}
