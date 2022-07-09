package Empresa;

import java.math.BigDecimal;
import java.security.DomainCombiner;

public class executarTeste {

	public static void main(String[] args) {

		produto produto1 = new produto();
		produto1.setNome("Módulo orientação a objeto");
		produto1.setId(1L);
		produto1.setValor(BigDecimal.valueOf(100));

		produto produto2 = new produto();
		produto2.setNome("Módulo de Spring Boot API REST");
		produto2.setId(2L);
		produto2.setValor(BigDecimal.valueOf(300));

		produto produto3 = new produto();
		produto3.setNome("Módulo de CSS");
		produto3.setId(3L);
		produto3.setValor(BigDecimal.valueOf(200));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda curso formação Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Wallace Crespo");
		venda.setValorTotal(BigDecimal.valueOf(600.00));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);

		System.out.println(venda.toString() + "Valor da variável total" + venda.getValorTotal());

	}

}
