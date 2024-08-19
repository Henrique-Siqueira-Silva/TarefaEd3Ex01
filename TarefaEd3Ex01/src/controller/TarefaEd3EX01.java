package controller;

public class TarefaEd3EX01 {
	
	public TarefaEd3EX01 () {
		super();
	}
		
	public int Ex01 (double num, int quanti){
		if (num < 1 ) {
//			O parametro de parada foi definido assim pois como o numero esta sendo dividido por 10
//			quando ele for menor que 1 quer dizer que o contador "quanti" já contou todos os numeros necessarios.
			return quanti;
		}
		else  {
				num = num / 10;
				quanti++;
			}
		return Ex01 (num, quanti);
//		Já na chamada , totas as variaveis se mantem normais por não existe necessidade de alteralas
//
	}
}
