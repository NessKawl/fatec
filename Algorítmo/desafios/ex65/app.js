
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')
let n2Input = document.getElementById('n2')
let n3Input = document.getElementById('n3')

function calcular() {
    let n1 = parseFloat(n1Input.value)
    let n2 = parseFloat(n2Input.value)
    let n3 = parseFloat(n3Input.value)

    let n1Q = n1 ** 2
    let n2Q = n2 ** 2
    let n3Q = n3 ** 2

    let somaQuadrados = n1Q + n2Q + n3Q

    div.innerHTML = `
        A soma dos quadrados de ${n1}, ${n2} e ${n3} é ${somaQuadrados},
    `

    if (somaQuadrados % 2 == 0) {
        div.innerHTML += `
            o resultado é PAR    
        `
    } else {
        div.innerHTML += `
            O resultado é ÍMPAR    
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