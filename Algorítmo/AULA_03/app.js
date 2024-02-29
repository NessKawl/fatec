let nome = prompt('Digite um nome:')

// typeof mostra o tipo de  dado (string, int...)
console.log(nome, typeof nome) 

let nota01 = prompt('Digite a primeira nota:')

nota01 = parseFloat(nota01)

console.log(nota01, typeof nota01)

let nota02 = parseFloat(prompt('Digite a segunda nota:'))

let soma = nota01 + nota02

console.log(nota02, typeof nota02)

console.log(nota01 + nota02)

document.getElementById('resultado').innerHTML = '<strong>Nome: </strong>' + nome + ' <br><strong> Nota 1: </strong>' + nota01 + '<br><strong> Nota 2: </strong>' + nota02 + '<br><strong> Soma das notas: </strong>' + soma + '<hr>'


document.getElementById('resultado2').innerHTML = `
    <strong>Nome:</strong> ${nome} 
    <br><strong>Nota 1: </strong> ${nota01} 
    <br><strong>Nota 2: </strong> ${nota02} 
    <br><strong>Soma das notas: </strong> ${soma}
`  // TEMPLATE STRING
