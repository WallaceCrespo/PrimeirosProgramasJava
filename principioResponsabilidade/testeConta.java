package principioResponsabilidade;

public class testeConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao (" Conta bancária do Alex");		
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
	}

}
