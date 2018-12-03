const fs = require('fs')

fs.readFile('../input.txt', 'utf8', (err, data) => {
    let boxIds = data.split('\n')
    boxIds.pop()
    let found = false
    let diff = 0
    let diffIdx = 0
    let checkAgainst;

    for (let i = 0; i < boxIds.length; i++) {
        if (found) break;

        for (let j = 0; j < boxIds.length; j++) {
            if (i == j && boxIds[i].length == boxIds[j].length) continue;
            let id1 = boxIds[i]
            let id2 = boxIds[j]
            diff = 0
            diffIdx = 0
            for (let k = 0; k < id1.length; k++) {
                if (id1[k] !== id2[k]) {
                    diff++;
                    diffIdx = k;
                }
            }
            if (diff == 1) {
                found = true;
                checkAgainst = id1
                break
            }
        }
    }

    console.log(diffIdx)
    console.log(`${checkAgainst.slice(0, diffIdx)}${checkAgainst.slice(diffIdx + 1)}`)
})