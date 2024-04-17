
let btn = document.getElementById('btn')
let div = document.getElementById('res')


function calcular() {


    for (let i = 0; i <= 20; i++) {
        if (i % 2 === 0) {
            div.innerHTML += `
            <span style="color: green;">${i} é PAR</span>   <br>
            `
        } else {
            div.innerHTML += `
            <span style="color: red;">${i} é ÍMPAR</span>   <br>
            `
        }
    }

}


calcular()