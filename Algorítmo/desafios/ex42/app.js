
let btn = document.getElementById('btn')
let div = document.getElementById('res')
let raioIput = document.getElementById('raio')
let alturaInput = document.getElementById('altura')

function calcular() {
    let raio = parseFloat(raioIput.value)
    let altura = parseFloat(alturaInput.value)

    let areaBase = Math.PI * raio ** 2

    let volumeCilindro = areaBase * altura

    div.innerHTML = `
        O volume do cilindro é: ${volumeCilindro}
    `
}

function limparForm () {

}

btn.addEventListener('click', calcular)