package polinomios;

import java.util.Random;

public class RendimientoTest {
	private Polinomio pol1, pol2, pol3, pol4, pol5, pol6, pol7, pol8, pol9, pol10, pol11;

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

		binomioNewton1 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 5);
		binomioNewton2 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 10);
		binomioNewton3 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 15);
		binomioNewton4 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 20);
		binomioNewton5 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 25);
		binomioNewton6 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 30);
		binomioNewton7 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 35);
		binomioNewton8 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 40);
		binomioNewton9 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 41);
		binomioNewton10 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 42);
		binomioNewton11 = new BinomioDeNewton(r.nextInt(100 - (-100)) + (-100), r.nextInt(100 - (-100)) + (-100), 43);
	}

	public void testRendimientoMSucesivas() {

		long start = System.currentTimeMillis();
		pol1.evaluarMSucesivas(2);
		long end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol1.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol2.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol2.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol3.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol3.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol4.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol4.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol5.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol5.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol6.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol6.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol7.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol7.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol8.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol8.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol9.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol9.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol10.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol10.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol11.evaluarMSucesivas(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarMSucesivas polinomio grado " + pol11.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		System.out.println();

	}

	public void testRendimientoRecursiva() {

		long start = System.currentTimeMillis();
		pol1.evaluarRecursiva(2);
		long end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol1.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol2.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol2.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol3.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol3.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol4.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol4.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol5.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol5.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol6.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol6.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol7.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol7.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol8.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol8.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol9.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol9.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol10.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol10.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol11.evaluarRecursiva(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursiva polinomio grado " + pol11.getGrado() + " tardó: " + (end - start) + " milisegundos.");

		System.out.println();

	}

	public void testRendimientoRecursivaPar() {

		long start = System.currentTimeMillis();
		pol1.evaluarRecursivaPar(2);
		long end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol1.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol2.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol2.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol3.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol3.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol4.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol4.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol5.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol5.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol6.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol6.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol7.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol7.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol8.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol8.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol9.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol9.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol10.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol10.getGrado() + ": " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol11.evaluarRecursivaPar(2);
		end = System.currentTimeMillis();
		System.out.println(
				"evaluarRecursivaPar polinomio grado " + pol11.getGrado() + ": " + (end - start) + " milisegundos.");

		System.out.println();

	}

	public void testRendimientoHorner() {

		long start = System.currentTimeMillis();
		pol1.evaluarHorner(2);
		long end = System.currentTimeMillis();
		System.out.println("evaluarHorner polinomio grado " + pol1.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol2.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out.println("evaluarHorner polinomio grado " + pol2.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol3.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out.println("evaluarHorner polinomio grado " + pol3.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol4.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out.println("evaluarHorner polinomio grado " + pol4.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol5.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out.println("evaluarHorner polinomio grado " + pol5.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol6.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out.println("evaluarHorner polinomio grado " + pol6.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol7.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out.println("evaluarHorner polinomio grado " + pol7.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol8.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out.println("evaluarHorner polinomio grado " + pol8.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol9.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out.println("evaluarHorner polinomio grado " + pol9.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol10.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out
				.println("evaluarHorner polinomio grado " + pol10.getGrado() + " " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		pol11.evaluarHorner(2);
		end = System.currentTimeMillis();
		System.out
				.println("evaluarHorner polinomio grado " + pol11.getGrado() + " " + (end - start) + " milisegundos.");

		System.out.println();
	}

	public void testRendimientoBinomioNewton() {
		int termino = 0;
		long start = 0L;
		long end = 0L;

		// Termino K (ITERATIVO)

		termino = r.nextInt(5 - 1);
		start = System.currentTimeMillis();
		binomioNewton1.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(10 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton2.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(15 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton3.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(20 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton4.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(25 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton5.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(30 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton6.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(35 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton7.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(40 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton8.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(41 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton9.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(42 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton10.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(43 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton11.terminoK(termino);
		end = System.currentTimeMillis();
		System.out.println("terminoK() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		System.out.println();

		// Termino K (RECURSIVO)

		termino = r.nextInt(5 - 1);
		start = System.currentTimeMillis();
		binomioNewton1.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(10 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton2.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(15 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton3.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(20 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton4.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(25 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton5.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(30 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton6.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(35 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton7.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(40 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton8.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(41 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton9.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(42 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton10.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		termino = r.nextInt(43 - 1) + 1;
		start = System.currentTimeMillis();
		binomioNewton11.terminoKRecursivo(termino);
		end = System.currentTimeMillis();
		System.out.println(
				"terminoKRecursivo() encontro el termino " + termino + " en : " + (end - start) + " milisegundos.");

		System.out.println();

		// Desarrollo completo (ITERATIVO)

		start = System.currentTimeMillis();
		binomioNewton1.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton1.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton2.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton2.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton3.desarrolloCompleto();
		end = System.currentTimeMillis();
		System.out
				.println("desarrolloCompleto() " + binomioNewton2.getN() + " en : " + (end - start) + " milisegundos.");

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

		// Desarrollo completo (Recursivo)

		start = System.currentTimeMillis();
		binomioNewton1.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompletoRecursivo() " + binomioNewton1.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton2.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompletoRecursivo() " + binomioNewton2.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton3.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompletoRecursivo() " + binomioNewton2.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton4.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompletoRecursivo() " + binomioNewton4.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton5.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompletoRecursivo() " + binomioNewton5.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton6.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompletoRecursivo() " + binomioNewton6.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton7.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompletoRecursivo() " + binomioNewton7.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton8.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompletoRecursivo() " + binomioNewton8.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton9.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println(
				"desarrolloCompletoRecursivo() " + binomioNewton9.getN() + " en : " + (end - start) + " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton10.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println("desarrolloCompletoRecursivo() " + binomioNewton10.getN() + " en : " + (end - start)
				+ " milisegundos.");

		start = System.currentTimeMillis();
		binomioNewton11.desarrolloCompletoRecursivo();
		end = System.currentTimeMillis();
		System.out.println("desarrolloCompletoRecursivo() " + binomioNewton11.getN() + " en : " + (end - start)
				+ " milisegundos.");

		System.out.println();
	}

	public static void main(String[] args) {

		RendimientoTest t = new RendimientoTest();

		 t.testRendimientoMSucesivas();
		 t.testRendimientoRecursivaPar();
		// t.testRendimientoHorner();
		//t.testRendimientoBinomioNewton();
	}
}
