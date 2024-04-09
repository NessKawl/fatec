
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')
let n2Input = document.getElementById('n2')
let n3Input = document.getElementById('n3')
let n4Input = document.getElementById('n4')

function calcular() {

    let n1 = parseFloat(n1Input.value)
    let n2 = parseFloat(n2Input.value)
    let n3 = parseFloat(n3Input.value)
    let n4 = parseFloat(n4Input.value)

    let media = ((n1 * 3) + (n2 * 5) + (n3 * 6) + (n4 * 6)) / 20

    if (isNaN (n1) || n1 > 10 || n1< 0 || isNaN (n2) || n2 > 10 || n2 < 0 || isNaN (n3) || n3 > 10 || n3 < 0 || isNaN (n4) || n4 > 10 || n4 < 0 ) {

        div.innerHTML = `
            <strong>Insira um valor válido!</strong>
        `
    } else if (media < 6) {
        div.innerHTML = `
            Sua média foi ${media}, infelizmente você está <span style="color: red;">REPROVADO.</span>
        `
    } else {
        div.innerHTML = `
            Sua média foi ${media}, parabéns você foi <span style="color: green;">APROVADO!</span>
        `
    }

    limparForm()
}

function limparForm () {
    n1Input.value = ""
    n2Input.value = ""
    n3Input.value = ""
    n4Input.value = ""

    n1Input.focus()
}

btn.addEventListener('click', calcular)