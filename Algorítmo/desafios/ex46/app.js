
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let grausInput = document.getElementById('grauC')

function calcular() {
    let grausC = parseFloat(grausInput.value)
    let grausF = grausC*(9/5)+32

    div.innerHTML = `
        ${grausC}°C em farenheit é: ${grausF}
    `
}

function limparForm () {
    grausInput.value = ""
    grausInput.focus()
}

btn.addEventListener('click', calcular)