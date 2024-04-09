
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')
let n2Input = document.getElementById('n2')

function calcular() {

    let n1 = parseFloat(n1Input.value)
    let n2 = parseFloat(n2Input.value)

    let area = (n1 * n2) / 2
    let hipotenusa = n1 ** 2 + n2 ** 2

    if (isNaN (n1) || n1 < 0 || isNaN (n2) || n2 < 0) {
        div.innerHTML = `
            <strong>Digite um valor válido!</strong>
        `
    } else {
        div.innerHTML = `
            A área do triângulo com base ${n1} e altura ${n2} é ${area} e sua hipotenusa é ${hipotenusa}
        `
    }

    

    limparForm()
}

function limparForm () {
    n1Input.value = ""

    n1Input.focus()
}

btn.addEventListener('click', calcular)