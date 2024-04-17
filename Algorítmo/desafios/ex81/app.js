
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
    let n5 = parseFloat(n5Input.value)

    let q1 = n1 ** 2
    let q2 = n2 ** 2
    let q3 = n3 ** 2
    let q4 = n4 ** 2
    let q5 = n5 ** 2

    div.innerHTML = `
        O quadrado do número ${n1} é ${q1} <br>
        O quadrado do número ${n2} é ${q2} <br>
        O quadrado do número ${n3} é ${q3} <br>
        O quadrado do número ${n4} é ${q4} <br>
        O quadrado do número ${n5} é ${q5} <br>
    `

}

function limparForm () {

}

btn.addEventListener('click', calcular)