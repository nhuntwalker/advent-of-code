const fs = require('fs')

fs.readFile('../input.txt', 'utf8', (err, data) => {
    let numbers = data.split('\n').map(numStr => Number(numStr))
    let sumTotal = numbers.reduce((total, num) => total + num)
    console.log(
        sumTotal >= 0 ?
        `The total change in frequency is +${sumTotal}` :
        `The total change in frequency is ${sumTotal}`
    )
})