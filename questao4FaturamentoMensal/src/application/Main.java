package application;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double sp, rj, mg, es, outros, total;
        sp = 67836.43;
        rj = 36678.66;
        mg = 29229.88;
        es = 27165.48;
        outros = 19849.53;

        total = sp + rj + mg + es + outros;

        System.out.printf("Faturamento do estado de SP: %.2f%%", (sp/total)*100);
        System.out.printf("\nFaturamento do estado de RJ: %.2f%%", (rj/total)*100);
        System.out.printf("\nFaturamento do estado de MG: %.2f%%", (mg/total)*100);
        System.out.printf("\nFaturamento do estado de ES: %.2f%%", (es/total)*100);
        System.out.printf("\nFaturamento de Outros estados: %.2f%%", (outros/total)*100);
    }
}
