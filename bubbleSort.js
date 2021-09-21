function bubbleSort(arr) {
   // base condition check 
   if(!arr || arr.length == 0)
        return arr;
   // loop through the array
   let size = arr.length;
   while(size >= 0) {
    for(let j=0; j<size-1;j++) { 
         if(arr[j] > arr[j+1]) {
             let temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
         }
      }
      // shrink the size by 1
      size = size - 1;
   }

   return arr;
}
console.log(bubbleSort([2,1,40,1,5]));


/*
 [2,1,40,1,5]
 [1,2,1,5,40]
*/