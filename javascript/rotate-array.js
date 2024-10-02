/*
    rotate an array by k positions
 */


const input = [1, 2, 3, 4, 5, 6, 7]
// result = [4,5,6,7,8,1,2,3]
const k = 3;
function reverseArray(input, start, end) {
    while (start < end) {
        temp = input[start]
        /*  s=0, e=7
            s=1,e=6
            s=2,e=5,
            s=3,e=4
            s=4,e=3
        */
        input[start] = input[end]
        input[end] = temp
        start++
        end--
    }

}


function rotateArray(input, k) {

    const start = 0;
    const end = input.length - 1;

    reverseArray(input, start, end)
    console.log(`first reverse` + input)
    reverseArray(input, start, k - 1)
    console.log(`second reverse` + input)
    reverseArray(input, k, end)
    console.log(`ROTATED ARRAY` + input)

}
rotateArray(input, k)