let nInt = parseInt(prompt('Digite um número inteiro'))

let ant = --nInt

let suc = nInt + 2

document.getElementById('res').innerHTML = `O número digitado foi ${nInt}, seu antecessor é ${ant} e seu sucessor é ${suc}`