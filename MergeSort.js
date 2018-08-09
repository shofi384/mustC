let main = () => {
    let array = [10, 11, 4, 5, 2, 9, 1, 8, 3, 6, 7, 5, 7, 10, 11];
    let temp = new Array(array.length);
    mergeSort(array, temp, 0, array.length-1);
    array.forEach(number => console.log(number));
}

let mergeSort = (array, temp, low, high) => {
    if(low < high) {
        let mid = Math.floor((low+high) / 2);
        mergeSort(array, temp, low, mid);
        mergeSort(array, temp, mid+1, high);
        merge(array, temp, low, mid, high);
    }
}

let merge = (array, temp, low, mid, high) => {
    for(let i=low; i<=high; i++) {
        temp[i] = array[i];
    }
    
    let current=low, left=low, right=mid+1;
    while(left<=mid && right<=high) {
        if(temp[left] <= temp[right]) {
            array[current++] = temp[left++];
        }
        else {
            array[current++] = temp[right++];
        }
    }
    
    let remaining = mid - left + 1;
    for(let i=0; i<remaining; i++) {
        array[current++] = temp[left+i];
    }
}

main();
