
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let pesoInput = document.getElementById('peso')
let alturaInput = document.getElementById('altura')

function calcular() {
    let peso = pesoInput.value
    let altura = alturaInput.value

    let imc = peso / (altura * altura)

    div.innerHTML = `
        O imc do peso ${peso} e altura ${altura} é ${imc}
    `
}

function limparForm () {
    pesoInput.value = ""
    alturaInput.value = ""

    pesoInput.focus()
}

btn.addEventListener('click', calcular)