
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')
let n2Input = document.getElementById('n2')
let n3Input = document.getElementById('n3')
let n4Input = document.getElementById('n4')
let n5Input = document.getElementById('n5')
let n6Input = document.getElementById('n6')
let n7Input = document.getElementById('n7')
let n8Input = document.getElementById('n8')
let n9Input = document.getElementById('n9')
let n10Input = document.getElementById('n10')

let arr = []


function calcular() {
   
    let n1 = parseFloat(n1Input.value)
    let n2 = parseFloat(n2Input.value)
    let n3 = parseFloat(n3Input.value)
    let n4 = parseFloat(n4Input.value)
    let n5 = parseFloat(n5Input.value)
    let n6 = parseFloat(n6Input.value)
    let n7 = parseFloat(n7Input.value)
    let n8 = parseFloat(n8Input.value)
    let n9 = parseFloat(n9Input.value)
    let n10 = parseFloat(n10Input.value)

    arr.push(n1)
    arr.push(n2)
    arr.push(n3)
    arr.push(n4)
    arr.push(n5)
    arr.push(n6)
    arr.push(n7)
    arr.push(n8)
    arr.push(n9)
    arr.push(n10)

    let positivos = 0

    let negativos = 0


    for (let i = 0; i <= 10;i++) {
        if (arr[i] > 0) {
            positivos++
        } else {
            negativos++
        }
        div.innerHTML = `
        O número de positivos é ${positivos} e o número de negativos é ${negativos}
        `
    }
    

    
    limparForm()

}

function limparForm () {
    n1Input.value = ""
    n2Input.value = ""
    n3Input.value = ""
    n4Input.value = ""
    n5Input.value = ""
    n6Input.value = ""
    n7Input.value = ""
    n8Input.value = ""
    n9Input.value = ""
    n10Input.value = ""

    n1Input.focus()
}

btn.addEventListener('click', calcular)