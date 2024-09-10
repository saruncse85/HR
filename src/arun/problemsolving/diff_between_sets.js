//1. mod all the numbers from first array until first number of 2nd array
//2. out of the first set which number divides all numbers in 2nd array are


function getTotalX(a, b) {
    let factorArr1 = [];
    let start = a[0];
    let end = b[0];
    
    for(let i = 0;i<a.length;i++) {
        let counter = start;
        while( counter <= end)  {
            if (counter%a[i] == 0) {
                console.log(a[i]);
                factorArr1.push(counter)
            }
            counter += 1;
        }    
    }
    
    function findDuplicates(arr) {
        const duplicates = [];
        const seen = new Set();

        for (const num of arr) {
            if (seen.has(num)) {
            duplicates.push(num);
            } else {
            seen.add(num);
            }
        }

        return duplicates;
    }

    const duplicateNumbers = findDuplicates(factorArr1);
    
    console.log(duplicateNumbers)
    
    for(let i = 0;i<duplicateNumbers.length;i++) {
        console.log(b.map( number => number/duplicateNumbers[i]))    
    }
    

}
