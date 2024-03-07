let l1 = parseFloat(prompt('Digite o tamanho de um dos lados do quadrado'))

let area = l1 * l1

let perimetro = l1 * 4

document.getElementById('res').innerHTML = `A <strong>Área</strong> do quadrado é <strong>${area}</strong> e o <strong>perímetro</strong> é <strong>${perimetro}</strong>`