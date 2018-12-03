const fs = require('fs')

fs.readFile('../input.txt', 'utf8', (err, data) => {
    let boxIds = data.split('\n')
    boxIds.pop()

    let counts = boxIds.reduce((acc, boxId) => {
        let letterCt = boxId
            .split('')
            .reduce((acc, letter) => {
                if (!acc.hasOwnProperty(letter)) acc[letter] = 0;
                acc[letter]++;
                return acc
            }, {})

        if (Object.values(letterCt).includes(2)) acc.twoCt++;
        if (Object.values(letterCt).includes(3)) acc.threeCt++;
        return acc
    }, {twoCt: 0, threeCt: 0})

    console.log(`The final checksum is ${
        counts.twoCt * counts.threeCt
    }`)
})