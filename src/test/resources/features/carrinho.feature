# language: pt

	Funcionalidade: Carrinho de compra
	Como cliente/usuario da Livelo
	Desejo escolher um(ns) produto(s)
	Para que ele(s) seja(m) adicionado(s) no carrinho de compras
	

	Esquema do Cenário: Adicionar produto ao carrinho de compras
	Dado que um navegador esta na home page da Livelo	
	Quando pesquisar por <produto> na barra de pesquisa
	E selecionar o primeiro produto do resultado da pesquisa
	E adicionar o produto ao carrinho
	Entao o navegador e direcionado para a pagina do carrinho
	E na descricao do produto deve conter <produto> 
	E a quantidade deve ser <quantidade>
	
	Exemplos:
	|produto 									|quantidade	|
	|"Echo Dot 3" 								|1			|
	|"Ventilador de Mesa Mondial Turbo Pro 55"	|1			|
	
	
	