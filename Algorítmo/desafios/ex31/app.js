let preco = parseFloat(prompt('Insira o preço de um livro'))

let desconto = 10 / 100 * preco

let total = preco - desconto

document.getElementById('res').innerHTML = `Com um desconto de 10% esse livro custará: ${total}`

