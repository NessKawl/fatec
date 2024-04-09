
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')
let n2Input = document.getElementById('n2')
let n3Input = document.getElementById('n3')

function calcular() {

    let n1 = parseFloat(n1Input.value)
    let n2 = parseFloat(n2Input.value)
    let n3 = parseFloat(n3Input.value)

    let media = (n1 + n2 + n3) / 3

    if (isNaN (n1) || n1 > 10 || n1< 0 || isNaN (n2) || n2 > 10 || n2 < 0 || isNaN (n3) || n3 > 10 || n3 < 0) {
        div.innerHTML = `
            <strong>Insira um valor válido!</strong>
        `
    } else if (media >= 7.5) {
        div.innerHTML = `
            Parabéns você foi <span style="color: green;">APROVADO</span> com a média ${media}
        `
    } else {
        div.innerHTML = `
            Infelizmente você foi <span style="color: red;">REPROVADO</span> com a média ${media}
        `
    }

    limparForm()
}

function limparForm () {
    n1Input.value = ""
    n2Input.value = ""
    n3Input.value = ""

    n1Input.focus()
}

btn.addEventListener('click', calcular)