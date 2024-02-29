
let nome = prompt('Digite seu nome:')

let lastName = prompt('Digite seu sobrenome:')

let idade = prompt('Digite sua idade:')

document.getElementById('msg').innerHTML = `<strong>Nome:</strong> ${nome} <br> <strong>Sobrenome:</strong> ${lastName} <br> <strong>Idade:</strong> ${idade} anos`