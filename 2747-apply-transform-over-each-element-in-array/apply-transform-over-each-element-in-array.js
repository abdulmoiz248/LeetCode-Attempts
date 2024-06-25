/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    newarr=arr.map((val,index)=>{
        return fn(val,index);
    })
    return newarr;
};