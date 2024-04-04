
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let num1Input = document.getElementById('num1')

function calcular() {
    let num1 = parseFloat(num1Input.value)

    if (num1 <= 0 || isNaN(num1)) {
        div.innerHTML = `
            <strong>ERRO!!</strong> O número digitado é inválido!
        `
    } else {

        if (num1 % 2 == 0) {
            div.innerHTML = `
                <ul>
                    <li>O número digitado foi: ${num1}</li>
                    <li>Seu valor elevado ao quadrado é: ${num1 ** 2}</li>
                    <li>Seu valor elevado ao cubo é: ${num1 ** 3}</li>
                    <li>Seu valor elevado a sétima é: ${num1 ** 7}</li>
                </ul>
            `
        } else {
            div.innerHTML = `
            <ul>
                <li>O número digitado foi: ${num1}</li>
                <li>Sua raiz quadrada é: ${Math.sqrt(num1)}</li>
                <li>Sua raiz cúbica é: ${Math.cbrt(num1)}</li>
                <li>Sua raiz sétima é: ${Math.pow(num1, 1/7)}</li>
            </ul>
        `
        }
    }

    limparForm()
}

function limparForm () {
    num1Input.value = ""
    num1Input.focus()
}

btn.addEventListener('click', calcular)