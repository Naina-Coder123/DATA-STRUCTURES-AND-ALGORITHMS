Till now we have studied one method to search the element i.e Linear search which has a 
time complexity of O(N);where we check every element and compares with the target so when there is a large dataset it 
can take a lot of time.
To optimise this ,the idea of BinarySearch came
In this algorithm, the search space is sorted and we divide the search spaceinto two equal halves
with the mid element if it is equals to it we return that element ,else if we search for the other two equals halves according to the requirement
int[] arr={1,2,3,3,4,5};
this array is sorted we have to search the element 2 so so we consider the zero based indexing and calculate the mid
mid=low+high/2;
if(arr[mid]==element){
    return element
}
else if(arr[mid]>element){
    we will search on the left
    by high=mid-1;
}
else{
    we will search on the right
    low=mid+1
}
This algorithm has a time complexity of o(LOG N)