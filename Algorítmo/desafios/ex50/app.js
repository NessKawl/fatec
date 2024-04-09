
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')
let n2Input = document.getElementById('n2')
let n3Input = document.getElementById('n3')

function calcular() {
    let n1 = parseFloat(n1Input.value)
    let n2 = parseFloat(n2Input.value)
    let n3 = parseFloat(n3Input.value)

    let vTotal = n1 + n2 + n3
    let d10 = 10 / 100 * vTotal
    let d20 = 20 / 100 * vTotal
    let d30 = 30 / 100 * vTotal
    let d50 = 50 / 100 * vTotal

    let valorD10 = vTotal - d10
    let valorD20 = vTotal - d20
    let valorD30 = vTotal - d30
    let valorD50 = vTotal - d50

    div.innerHTML = `
        Os valor total dos 3 produtos é: ${vTotal} <br>
        Os valor total com 10% de desconto é: ${valorD10} <br>
        Os valor total com 20% de desconto é: ${valorD20} <br>
        Os valor total com 30% de desconto é: ${valorD30} <br>
        Os valor total com 50% de desconto é: ${valorD50} <br>
    `
}

function limparForm () {

}

btn.addEventListener('click', calcular)