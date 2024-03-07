let conta = parseFloat(prompt('Insira o valor total da conta'))

let gorjeta = parseFloat(prompt('Insira a porcentagem da gorjeta'))

let porcentagemGorjeta = gorjeta / 100 * conta

let total = conta + porcentagemGorjeta

document.getElementById('res').innerHTML = `O valor total a ser pago será ${total}`