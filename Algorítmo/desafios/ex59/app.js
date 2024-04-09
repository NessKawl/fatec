
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')

function calcular() {

    let n1 = parseFloat(n1Input.value)

    if (isNaN (n1)) {
        div.innerHTML = `
            <strong>Digite um valor válido!</strong>
        `
    } else if (n1 % 2 == 0) {
        div.innerHTML = `
            O número ${n1} é PAR e seu valor elevado ao quadrado é ${n1 ** 2}
        `
    } else {
        div.innerHTML = `
            O número ${n1} é IMPAR e seu valor elevado ao cubo é ${n1 ** 3}
        `
    }

    

    limparForm()
}

function limparForm () {
    n1Input.value = ""

    n1Input.focus()
}

btn.addEventListener('click', calcular)