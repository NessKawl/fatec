
let n1 = parseFloat(prompt('Digite um número:'))

let n2 = parseFloat(prompt('Digite mais um número:'))

let soma = n1 + n2 

document.getElementById('resultado').innerHTML = `A <strong>soma</strong> entre ${n1} e ${n2} é <strong>${soma}</strong>`