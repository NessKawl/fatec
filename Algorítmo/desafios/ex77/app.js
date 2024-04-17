
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')

function calcular() {
    let n1 = parseFloat(n1Input.value)

    for (let i = 0; i < 11; i++) {
        div.innerHTML += `
            ${n1} X ${i} = ${n1 * i} <br>
        `
    }

}

function limparForm () {

}

btn.addEventListener('click', calcular)