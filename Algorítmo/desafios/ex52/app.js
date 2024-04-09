
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let valorContaInput = document.getElementById('valorConta')
let porcentagemInput = document.getElementById('porcentagem')

function calcular() {
    let valorConta = parseFloat(valorContaInput.value)
    let porcentagem = parseFloat(porcentagemInput.value)

    let gorjeta = valorConta * porcentagem / 100

    let vTotal = valorConta + gorjeta

    div.innerHTML = `
        O valor da gorjeta será R$ ${gorjeta} <br>
        O valor total a ser pago será R$ ${vTotal}
    `

}

function limparForm () {

}

btn.addEventListener('click', calcular)