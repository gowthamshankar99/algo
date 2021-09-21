function insertionSort(arr) {
    if(!arr || arr.length == 0)
        return arr;

    let size = 0;
    let indexTracker = 0;
    while(size < arr.length) {
        let min = Number.MAX_SAFE_INTEGER;
        for(let i=size;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
                indexTracker = i;
            }
        }
        let temp = arr[size];
        arr[size] = min;
        arr[indexTracker] = temp;
        size++;
    }

    return arr;

}

console.log(insertionSort([2,1,40,1,5]));
