
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let n1Input = document.getElementById('n1')

let arr = []


function calcular() {
   
    let n1 = parseFloat(n1Input.value)

    if (arr.length < 10) {

        arr.push(n1)

        div.innerHTML = " "

        let positivo = 0
        let negativo = 0

        for (let i = 0; i < arr.length;i++) {

            div.innerHTML += `
                ${arr[i]} | 
            `

            if (arr[i] > 0) {
                positivo++
            }
            
            if (arr[i] < 0){
                negativo++
            }
        }  
    
        div.innerHTML += `
            <p>
                A quantidade de números positivos é: ${positivo} <br>
                A quantdade de números negativos é: ${negativo}
            </p>
        `
    
    } else {
        n1Input.classList.add('d-none')
        btn.classList.add('d-none')
    }

    limparForm()

}

function limparForm () {
    n1Input.value = ""

    n1Input.focus()
}

btn.addEventListener('click', calcular)