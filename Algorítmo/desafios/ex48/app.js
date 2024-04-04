
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let alturaDegrauInput = document.getElementById('num1')
let alturaDesejadaInput = document.getElementById('num2')

function calcular() {
    let alturaDegrau = alturaDegrauInput.value 
    let alturaDesejada = alturaDesejadaInput.value

    let nDegraus = alturaDesejada / alturaDegrau

    div.innerHTML = `
        O usuário deverá subir ${nDegraus} degraus.
    `

    limparForm()
}

function limparForm () {
    alturaDegrauInput.value = ""
    alturaDesejadaInput.value = ""

    alturaDegrauInput.focus()
}

btn.addEventListener('click', calcular)