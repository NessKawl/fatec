let btn = document.querySelector('#btn')
let div = document.querySelector('#res')
let picoleInput = document.querySelector('#picole')
let qtdInput = document.querySelector('#qtd')

btn.addEventListener('click', () => {
    let picole = picoleInput.value
    let qtd = parseFloat(qtdInput.value)

    let tipoPicole = ''
    let valor = 0

    // if (picole == '1') {
    //     valor = 2.5
    //     tipoPicole = 'Picole de morango'
    // } else if (picole == '2') {
    //     valor = 5.6
    //     tipoPicole = 'Picole de abacaxi'
    // } else {
    //     valor = 7.75
    //     tipoPicole = 'Picole de coco'
    // }

    switch(picole){
        case '1':
            valor = 2.5
            tipoPicole = 'Picole de morango'
            break
        case '2':
            valor = 5.6
            tipoPicole = 'Picole de abacaxi'
            break
        case '3':
            valor = 7.75
            tipoPicole = 'Picole de coco'
            break
        }

    vTotal = valor * qtd

    div.innerHTML += `

        <div class="col-lg-2 text-center border rounded-3 m-3">
            <div class="p-3">
                <p><strong>Produto:</strong> ${tipoPicole}</p>
                <p><strong>valor:</strong> R$: ${valor.toFixed(2)}</p>
                <p><strong>Quantidade:</strong> ${qtd}</p>
                <p><stronh>TOTAL:</stronh> R$: ${vTotal.toFixed(2)}</p>
            </div>
        </div>
              
    `
})