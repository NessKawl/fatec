
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')
let n2Input = document.getElementById('n2')
let n3Input = document.getElementById('n3')
let n4Input = document.getElementById('n4')
let n5Input = document.getElementById('n5')

function calcular() {
    let n1 = parseFloat(n1Input.value)
    let n2 = parseFloat(n2Input.value)
    let n3 = parseFloat(n3Input.value)
    let n4 = parseFloat(n4Input.value)
    let n5 = parseFloat(n1Input.value)

    let media = (n1 + n2 + n3 + n4 + n5) / 5

    div.innerHTML = `
        A média aritmética das notas ${n1}, ${n2}, ${n3}, ${n4}, ${n5} é: ${media}
    `
}

function limparForm () {

}

btn.addEventListener('click', calcular)