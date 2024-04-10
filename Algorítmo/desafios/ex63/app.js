
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')
let n2Input = document.getElementById('n2')
let n3Input = document.getElementById('n3')

function calcular() {
    
    let n1 = parseFloat(n1Input.value)
    let n2 = parseFloat(n2Input.value)
    let n3 = parseFloat(n3Input.value)    

    // let numStr1 = positivoNegativoNull(n1)
    // let numStr2 = positivoNegativoNull(n2)
    // let numStr3 = positivoNegativoNull(n3)


    div.innerHTML = `
        <p>O número ${n1} é ${positivoNegativoNull(n1)}</p>
        <p>O número ${n2} é ${positivoNegativoNull(n2)}</p>
        <p>O número ${n3} é ${positivoNegativoNull(n3)}</p>
        <p>O maior número é ${Math.max(n1, n2, n3)}</p>
    `

    limparForm()
}

function positivoNegativoNull (num) {
    if (num > 0) {
       return 'Positivo'
    } else if (num < 0) {
        return 'Negativo'
    } else {
        return 'Nulo'
    }
}

function limparForm () {
    n1Input.value = ""
    n2Input.value = ""
    n3Input.value = ""

    n1Input.focus()
}

btn.addEventListener('click', calcular)