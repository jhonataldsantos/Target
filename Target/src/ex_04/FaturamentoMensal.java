package ex_04;

/**
 * @author Jhonata Lopes dos Santos
 * 
 */

public class FaturamentoMensal {

	public static void main(String[] args) {
		double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
		System.out.println("*-- CALCULA TOTAL --*");
		double total = calculaTotal(sp, rj, mg, es, outros);
		System.out.println("TOTAL: " + total);
		System.out.println("*-- CALCULA PORCENTAGEM --*");
		calculaPercentual(sp, rj, mg, es, outros, total);
	}

	public static double calculaTotal(double sp, double rj, double mg, double es, double outros) {
		double total = sp + rj + mg + es + outros;
		return total;
	}

	public static void calculaPercentual(double sp, double rj, double mg, double es, double outros, double total) {
		double media_sp = (sp / total) * 100;
		System.out.printf("SP: %.2f%%\n", media_sp);
		double media_rj = (rj / total) * 100;
		System.out.printf("RJ: %.2f%%\n", media_rj);
		double media_mg = (mg / total) * 100;
		System.out.printf("MG: %.2f%%\n", media_mg);
		double media_es = (es / total) * 100;
		System.out.printf("ES: %.2f%%\n", media_es);
		double media_outros = (outros / total) * 100;
		System.out.printf("OUTROS: %.2f%%", media_outros);
	}
}
