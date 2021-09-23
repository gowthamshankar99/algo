function insertionSort(arr) {
     
     for(let i=1;i<arr.length;i++) {
        let currentNumber = arr[i], j = i;
        while(j > 0 && currentNumber < arr[j-1]) {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = currentNumber;
     }

     return arr;
}

console.log(insertionSort([2,1,40,1,5]));

// 2,1,40,1,5