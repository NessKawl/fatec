
let contador = 0 

while (contador < 5) {
    contador++; 
    console.log(contador, 'Estou aprendendo JavaScript!')
    document.getElementById(`msg${contador}`).innerHTML = `${contador} Estou aprendendo JavaScript`
}
