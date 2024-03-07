let b = parseFloat(prompt('Digite o comprimento do retângulo'))

let h = parseFloat(prompt('Digite a altura do retângulo'))

let area = b * h

let perimetro = (b * 2) + (h * 2)

document.getElementById('res').innerHTML = `A <strong>Área</strong> do retângulo é <strong>${area}</strong> e o <strong>perimetro</strong> é <strong>${perimetro}</strong>`