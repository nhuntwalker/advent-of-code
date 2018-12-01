const fs = require('fs')

fs.readFile('../input.txt', 'utf8', (err, data) => {
    let numbers = data.split('\n').map(numStr => Number(numStr))
    numbers.pop()
    let currFreq = 0
    let idx = 0
    let pastFreqs = new Set()

    while (true) {
        if (idx === numbers.length) idx = 0;
        if (pastFreqs.has(currFreq)) break;
        pastFreqs.add(currFreq)
        currFreq += numbers[idx]
        idx++
    }
    
    console.log(`The first repeated frequency is ${currFreq}`)
})