
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')
let n2Input = document.getElementById('n2')

function calcular() {
    let n1 = parseFloat(n1Input.value)
    let n2 = parseFloat(n2Input.value)

    let nMaior = Math.max(n1, n2)

    div.innerHTML = `
        O maior número entre ${n1} e ${n2} é ${nMaior}
    `
}

function limparForm () {

}

btn.addEventListener('click', calcular)