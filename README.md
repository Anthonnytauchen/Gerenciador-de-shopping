# Gerenciador-de-shopping
explique o que e para o que serve
Claro! Vou explicar o projeto de forma mais detalhada:

O que é
Este projeto é um Gerenciador de Shopping, desenvolvido como parte da disciplina de Programação 1 - Laboratório 1. O objetivo é criar um sistema que permita gerenciar as lojas de um shopping, facilitando a adição, remoção e listagem de lojas, bem como a realização de algumas operações específicas.

Para que serve
O Gerenciador de Shopping serve para:
Adicionar Lojas: Permite inserir novas lojas no shopping, desde que haja espaço disponível.
Remover Lojas: Permite remover lojas do shopping pelo nome.
Listar Lojas: Gera uma lista detalhada de todas as lojas presentes no shopping.
Quantificar Lojas por Tipo: Conta o número de lojas de um tipo específico, como "Alimentação", "Bijuteria", "Vestuário", "Informática" e "Cosmético".
Identificar a Loja de Informática com o Seguro Mais Caro: Localiza a loja de informática que possui o seguro mais caro entre todas as lojas do mesmo tipo.
Estrutura do Projeto
Classe Shopping: É a principal classe do projeto, contendo métodos para adicionar, remover, listar lojas, contar lojas por tipo e encontrar a loja de informática com o seguro mais caro.

Classe Endereco: Representa o endereço do shopping.

Classe Loja: Uma classe base para diferentes tipos de lojas.

Classes Específicas: Alimentacao, Bijuteria, Vestuario, Informatica, e Cosmetico que herdam de Loja e possuem características específicas.
