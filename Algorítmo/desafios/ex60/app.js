
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')

function calcular() {

    let n1 = parseFloat(n1Input.value)

    if (isNaN (n1) || n1 < 0) {
        div.innerHTML = `
            <strong>Insira um valor válido!</strong>
        `
    } else if (n1 % 2 == 0) {
        div.innerHTML = `
            O número ${n1} é <span style="color: green;">PAR</span>
        `
    } else {
        div.innerHTML = `
            O número ${n1} é <span style="color: red;">ÍMPAR</span>
        `
    }

    

    limparForm()
}

function limparForm () {
    n1Input.value = ""

    n1Input.focus()
}

btn.addEventListener('click', calcular)