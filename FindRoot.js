/* Finds the root of the given int n without using any libraray function */

let main = () => [3, 4, 5, 9, 11, 16, 17, 25, 0].forEach(n => console.log(findRoot(n, 0, n)));

let findRoot = (n, min, max) => {
    if(max < min)	// no perfect(int) root
        return `${n} is not a perfect square`;
    
    let guess = Math.floor((min+max) / 2);
    if((guess*guess) == n)	// root found
        return `${n}'s root is ${guess}`;
    else if((guess*guess)<n)	// root is greater then guess
			min = guess + 1;
    else if((guess*guess)>n)	// root is less than guess
        max = guess - 1;
    return findRoot(n, min, max);
}

main();
