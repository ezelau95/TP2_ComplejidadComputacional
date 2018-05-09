package polinomios;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class RendimientoTest {
	private Polinomio pol1;
	private Polinomio pol2;
	private Polinomio pol3;
	private Polinomio pol4;
	private Polinomio pol5;
	private Polinomio pol6;
	private Polinomio pol7;
	private Polinomio pol8;
	private Polinomio pol9;
	private Polinomio pol10;
	private Polinomio pol11;
	private BinomioDeNewton binomioNewton1, binomioNewton2, binomioNewton3, binomioNewton4, binomioNewton5,
			binomioNewton6, binomioNewton7, binomioNewton8, binomioNewton9, binomioNewton10, binomioNewton11;

	private Random r;

	public RendimientoTest() {
		super();

		r = new Random();

		pol1 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(100, 1, 100));
		pol2 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(500, 1, 100));
		pol3 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(750, 1, 100));
		pol4 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(1000, 1, 100));
		pol5 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(5000, 1, 100));
		pol6 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(7000, 1, 100));
		pol7 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(10000, 1, 100));
		pol8 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(50000, 1, 100));
		pol9 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(100000, 1, 100));
		pol10 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(500000, 1, 100));
		pol11 = new Polinomio(GeneradorPolinomio.generarPolinomioAleatorio(1000000, 1, 100));

		binomioNewton1 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 100);
		binomioNewton2 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 500);
		binomioNewton3 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 750);
		binomioNewton4 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 1000);
		binomioNewton5 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 5000);
		binomioNewton6 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 7000);
		binomioNewton7 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 10000);
		binomioNewton8 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 50000);
		binomioNewton9 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100),
				100000);
		binomioNewton10 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100),
				500000);
		binomioNewton11 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100),
				1000000);
	}

	public void testRendimiento() {

		long start = System.currentTimeMillis();
		pol1.evaluarMSucesivas(2);
		long end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol1.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol1.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol1.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol1.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol1.getGrado() + " " + (end - start) + " milisegundos.");

		System.out.println();

		start = System.currentTimeMillis();
		pol2.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol2.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol2.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol2.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol2.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol2.getGrado() + " " + (end - start) + " milisegundos.");

		System.out.println();

		start = System.currentTimeMillis();
		pol3.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol3.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol3.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol3.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol3.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol3.getGrado() + " " + (end - start) + " milisegundos.");

		System.out.println();

		start = System.currentTimeMillis();
		pol4.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol4.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol4.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol4.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol4.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol4.getGrado() + " " + (end - start) + " milisegundos.");

		System.out.println();

		start = System.currentTimeMillis();
		pol5.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol5.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol5.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol5.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol5.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol5.getGrado() + " " + (end - start) + " milisegundos.");

		System.out.println();

		start = System.currentTimeMillis();
		pol6.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol6.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol6.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol6.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol6.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol6.getGrado() + " " + (end - start) + " milisegundos.");

		System.out.println();

		start = System.currentTimeMillis();
		pol7.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol7.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol7.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol7.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol7.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol7.getGrado() + " " + (end - start) + " milisegundos.");

		System.out.println();

		// start = System.currentTimeMillis();
		// pol8.evaluarMSucesivas(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarMSucesivas polinomio grado " + pol8.getGrado() + " " + (end - start)
		// + " milisegundos.");
		//
		// start = System.currentTimeMillis();
		// pol8.evaluarRecursiva(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarRecursiva polinomio grado " + pol8.getGrado() + " " + (end - start) +
		// " milisegundos.");
		//
		// start = System.currentTimeMillis();
		// pol8.evaluarRecursivaPar(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarRecursivaPar polinomio grado " + pol8.getGrado() + " " + (end -
		// start) + " milisegundos.");
		//
		// System.out.println();
		//
		// start = System.currentTimeMillis();
		// pol9.evaluarMSucesivas(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarMSucesivas polinomio grado " + pol9.getGrado() + " " + (end - start)
		// + " milisegundos.");
		//
		// start = System.currentTimeMillis();
		// pol9.evaluarRecursiva(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarRecursiva polinomio grado " + pol9.getGrado() + " " + (end - start) +
		// " milisegundos.");
		//
		// start = System.currentTimeMillis();
		// pol9.evaluarRecursivaPar(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarRecursivaPar polinomio grado " + pol9.getGrado() + " " + (end -
		// start) + " milisegundos.");
		//
		// System.out.println();
		//
		// start = System.currentTimeMillis();
		// pol10.evaluarMSucesivas(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarMSucesivas polinomio grado " + pol10.getGrado() + " " + (end - start)
		// + " milisegundos.");
		//
		// start = System.currentTimeMillis();
		// pol10.evaluarRecursiva(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarRecursiva polinomio grado " + pol10.getGrado() + " " + (end - start)
		// + " milisegundos.");
		//
		// start = System.currentTimeMillis();
		// pol10.evaluarRecursivaPar(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarRecursivaPar polinomio grado " + pol10.getGrado() + " " + (end -
		// start) + " milisegundos.");
		//
		// System.out.println();
		//
		// start = System.currentTimeMillis();
		// pol11.evaluarMSucesivas(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarMSucesivas polinomio grado " + pol11.getGrado() + " " + (end - start)
		// + " milisegundos.");
		//
		// start = System.currentTimeMillis();
		// pol11.evaluarRecursiva(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarRecursiva polinomio grado " + pol11.getGrado() + " " + (end - start)
		// + " milisegundos.");
		//
		// start = System.currentTimeMillis();
		// pol11.evaluarRecursivaPar(2);
		// end = System.currentTimeMillis();
		// System.out.println(
		// "evaluarRecursivaPar polinomio grado " + pol11.getGrado() + " " + (end -
		// start) + " milisegundos.");
		//
		// System.out.println();

		// Test de binomio de Newton

		int termino = 0;

		termino = r.nextInt(100 - 1);
		start = System.currentTimeMillis();
		binomioNewton1.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(500 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton2.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(750 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton3.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(1000 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton4.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(5000 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton5.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(7000 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton6.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(10000 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton7.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(50000 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton8.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(100000 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton9.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(500000 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton10.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(1000000 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton11.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + "en : " + (end - start) + " milisegundos.");

		System.out.println();

		// -----------------------------------------------------

		start = System.currentTimeMillis();
		binomioNewton1.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton1.getN() + "en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton2.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton2.getN() + "en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton3.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton2.getN() + "en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton4.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton4.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton5.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton5.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton6.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton6.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton7.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton7.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton8.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton8.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton9.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton9.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton10.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompleto() " + binomioNewton10.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton11.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompleto() " + binomioNewton11.getN() + " en : " + (end - start) + " milisegundos.");

		System.out.println();
	}

	public static void main(String[] args) {

		RendimientoTest t = new RendimientoTest();

		t.testRendimiento();
	}
}
